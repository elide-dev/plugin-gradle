package dev.elide.buildtools.gradle.plugin.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.plugins.BasePlugin
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option
import tools.elide.bundler.AssetBundler

/** Task which creates Elide asset specifications for embedding in app JARs. */
abstract class BundleAssetsBuildTask : DefaultTask() {
    /** Asset bundler tool. */
    private val bundler: AssetBundler = AssetBundler.create()

    init {
        description = "Configures an application target for use with ESBuild or Webpack"
        group = BasePlugin.BUILD_GROUP

        // set defaults
        with(project) {
            // nothing yet
        }
    }

    /** Folder in which to put built bundle targets. */
    @get:Input
    @get:Option(
        option = "outputBundleFolder",
        description = "Where to put compiled asset catalogs on the filesystem. Typically managed by the plugin.",
    )
    abstract val outputBundleFolder: Property<String>

    /** Whether to compress assets. */
    @get:Input
    @get:Option(
        option = "compress",
        description = "Whether to pre-compress assets before adding them to the embedded catalog.",
    )
    var compress: Boolean = true

    @TaskAction fun buildWriteCatalog() {
        // Nothing yet.
    }
}
