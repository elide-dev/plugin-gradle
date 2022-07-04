package dev.elide.buildtools.gradle.plugin

import dev.elide.buildtools.gradle.plugin.js.BundleTarget
import dev.elide.buildtools.gradle.plugin.js.BundleTool
import dev.elide.buildtools.gradle.plugin.tasks.BundleAssetsBuildTask
import dev.elide.buildtools.gradle.plugin.tasks.EmbeddedJsBuildTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.file.DuplicatesStrategy
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.tasks.Copy
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsCompilerType
import org.jetbrains.kotlin.gradle.targets.js.ir.KotlinJsIrLink
import org.jetbrains.kotlin.gradle.targets.js.npm.NpmDependencyExtension

@Suppress("unused")
abstract class ElidePlugin : Plugin<Project> {
    companion object {
        const val EXTENSION_NAME = "elide"
        const val BUNDLE_ASSETS_TASK_NAME = "bundleAssets"
    }

    object Versions {
        const val esbuild = "0.14.48"
        const val prepack = "0.2.54"
    }

    @Suppress("TooGenericExceptionCaught")
    private fun resolveJsIrLinkTask(project: Project): KotlinJsIrLink {
        // resolve the Kotlin JS compile task (IR only)
        return try {
            project.tasks.named(
                "compileProductionExecutableKotlinJs",
                KotlinJsIrLink::class.java
            ).get()
        } catch (err: Throwable) {
            throw IllegalStateException(
                "Failed to resolve Kotlin JS IR link task: please ensure the Kotlin JS plugin is applied " +
                "to the project and configured to use the IR compiler.",
                err
            )
        }
    }

    override fun apply(project: Project) {
        // Add the 'template' extension object
        var kotlinPluginFound = false
        val extension = project.extensions.create(EXTENSION_NAME, ElideExtension::class.java, project)

        if (project.plugins.hasPlugin("org.jetbrains.kotlin.js")) {
            kotlinPluginFound = true

            // make sure node plugin is applied
            project.plugins.apply("com.github.node-gradle.node")
            project.dependencies.apply {
                (this as ExtensionAware).extensions.configure(NpmDependencyExtension::class.java) { npm ->
                    add("implementation", npm("esbuild", Versions.esbuild))
                    add("implementation", npm("prepack", Versions.prepack))
                }
            }

            // load JS plugin, configure with output, connect outputs to embedded build
            project.plugins.withId("org.jetbrains.kotlin.js") { _ ->
                project.extensions.configure(KotlinJsProjectExtension::class.java) { jsExt ->
                    val elideJsExt = project.extensions.create(
                        ElideEmbeddedJsExtension.EXTENSION_NAME,
                        ElideEmbeddedJsExtension::class.java,
                        project,
                    )
                    val hasNode = project.plugins.hasPlugin(
                        "com.github.node-gradle.node"
                    )

                    jsExt.js(KotlinJsCompilerType.IR) {
                        if (hasNode || elideJsExt.target.getOrElse(BundleTarget.EMBEDDED) == BundleTarget.EMBEDDED) {
                            nodejs {
                                binaries.executable()
                            }
                        } else {
                            browser {
                                binaries.executable()
                            }
                        }
                    }

                    // resolve JS IR link task that we just set up
                    val compileProdKotlinJs = resolveJsIrLinkTask(
                        project
                    )

                    // resolve embedded sources at `ssr/ssr.js`
                    val fetchBuildSources = project.tasks.create("prepareEmbeddedJsBuild", Copy::class.java) {
                        it.dependsOn(compileProdKotlinJs)
                        it.from(compileProdKotlinJs.outputs.files.files) { copySpec ->
                            copySpec.duplicatesStrategy = DuplicatesStrategy.EXCLUDE
                        }
                        it.from(compileProdKotlinJs.outputFileProperty) { copySpec ->
                            copySpec.rename { "ssr.js" }
                        }
                        it.into(
                            "${project.buildDir}/ssr"
                        )
                    }

                    val target = elideJsExt.target.getOrElse(
                        BundleTarget.EMBEDDED
                    )
                    val tool = elideJsExt.tool.getOrElse(
                        if (hasNode || elideJsExt.target.getOrElse(BundleTarget.EMBEDDED) == BundleTarget.EMBEDDED) {
                            BundleTool.ESBUILD
                        } else {
                            BundleTool.WEBPACK
                        }
                    )
                    EmbeddedJsBuildTask.setup(
                        project,
                        fetchBuildSources,
                        compileProdKotlinJs,
                        tool,
                        target,
                        extension,
                        elideJsExt,
                    )
                }
            }
        }

        if (project.plugins.hasPlugin("org.jetbrains.kotlin.jvm")) {
            kotlinPluginFound = true
            project.plugins.withId("org.jetbrains.kotlin.jvm") {
                // we're applying to a JVM Kotlin target. in this case, we're consuming static assets from other
                // modules  or from within the resource section of this module.
                val processResources = project.tasks.named(
                    "processResources",
                )

                // register task to build embedded asset spec
                project.tasks.register(BUNDLE_ASSETS_TASK_NAME, BundleAssetsBuildTask::class.java) {
                    it.dependsOn(processResources)
                }
            }
        }

        if (project.plugins.hasPlugin("org.jetbrains.kotlin.multiplatform")) {
            kotlinPluginFound = true
            project.logger.warn(
                "Elide doesn't yet support JS targets in Kotlin MPP modules. Build plugin will have no effect."
            )
        }

        if (!kotlinPluginFound) throw IllegalStateException(
            "Please apply a Kotlin plugin to use the Elide plugin (`js` or `jvm`)."
        )
    }
}
