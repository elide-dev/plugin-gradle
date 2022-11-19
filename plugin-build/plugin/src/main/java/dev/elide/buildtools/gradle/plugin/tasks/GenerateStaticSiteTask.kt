package dev.elide.buildtools.gradle.plugin.tasks

import dev.elide.buildtools.gradle.plugin.ElideExtension
import org.gradle.api.DefaultTask
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

/**
 * # Task: Generate Static Site
 *
 * This task implements the Static Site Generator (SSG) tooling for the Elide plugin. It is responsible for executing
 * built app handlers to produce a static site at build time, based on the manifest created by the KSP-based route
 * processor.
 */
abstract class GenerateStaticSiteTask : DefaultTask() {
    companion object {
        private const val TASK_NAME = "generateStaticSite"

        // After determining the SSG build is eligible to run, apply plugins, then build/install tasks.
        @JvmStatic fun install(extension: ElideExtension, project: Project) {

        }
    }

    /**
     * Run the action to fulfill SSG build settings, by generating a static site from the target application.
     */
    @TaskAction fun runAction() {

    }
}
