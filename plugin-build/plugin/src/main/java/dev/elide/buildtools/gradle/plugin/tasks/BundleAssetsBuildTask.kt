package dev.elide.buildtools.gradle.plugin.tasks

import org.gradle.api.DefaultTask
import org.gradle.api.plugins.BasePlugin

/** Task which creates Elide asset specifications for embedding in app JARs. */
abstract class BundleAssetsBuildTask : DefaultTask() {
    init {
        description = "Configures an application target for use with ESBuild or Webpack"
        group = BasePlugin.BUILD_GROUP

        // set defaults
        with(project) {
            // nothing yet
        }
    }
}
