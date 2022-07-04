package dev.elide.buildtools.gradle.plugin.cfg

import org.gradle.api.Action
import org.gradle.api.Project
import org.gradle.api.model.ObjectFactory
import tools.elide.assets.EmbeddedScriptLanguage
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicReference
import javax.inject.Inject

/** Elide JVM server target settings. */
@Suppress("RedundantVisibilityModifier", "MemberVisibilityCanBePrivate", "unused")
open class ElideServerHandler @Inject constructor(
    objects: ObjectFactory
) {
    companion object {
        /** Default scripting language to apply. */
        private val defaultScriptLanguage = EmbeddedScriptLanguage.JS
    }

    /** Whether the user configured a server target in their build script. */
    internal val active: AtomicBoolean = AtomicBoolean(false)

    /** Server embedded SSR configuration. */
    internal val ssrConfig: ServerSSRHandler = objects.newInstance(ServerSSRHandler::class.java)

    /** Server embedded SSR configuration. */
    internal val ssrRuntime: AtomicReference<EmbeddedScriptLanguage> = AtomicReference(defaultScriptLanguage)

    /** Configure a JVM server target for SSR. */
    public fun ssr(language: EmbeddedScriptLanguage = defaultScriptLanguage, action: Action<ServerSSRHandler>) {
        ssrRuntime.set(language)
        action.execute(ssrConfig)
    }

    /** Configures SSR features for Elide server targets. */
    open class ServerSSRHandler {
        companion object {
            const val defaultSsrConfiguration = "nodeSsrDist"
        }

        private val targetProject: AtomicReference<String?> = AtomicReference(null)
        private val targetConfiguration: AtomicReference<String?> = AtomicReference(defaultSsrConfiguration)

        /** Inject the specified JS bundle as an SSR application script. */
        fun bundle(project: Project, configuration: String = defaultSsrConfiguration) {
            targetProject.set(project.name)
            targetConfiguration.set(configuration)
        }
    }
}
