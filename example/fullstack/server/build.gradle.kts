@file:Suppress(
    "UnstableApiUsage",
    "unused",
    "UNUSED_VARIABLE",
    "DSL_SCOPE_VIOLATION",
)

import dev.elide.buildtools.gradle.plugin.BuildMode
import tools.elide.assets.EmbeddedScriptLanguage

plugins {
    kotlin("jvm")
    alias(libs.plugins.node)
    id("dev.elide.buildtools.plugin")
}

val nodeSsrDist: Configuration by configurations.creating {
    isCanBeConsumed = false
    isCanBeResolved = true
}

dependencies {
    nodeSsrDist(project(mapOf("path" to ":example:fullstack:node", "configuration" to nodeSsrDist.name)))
}

tasks.withType<Copy>().named("processResources") {
    dependsOn("copyEmbedded")
}

tasks.register<Copy>("copyEmbedded") {
    from(nodeSsrDist)
    into("$buildDir/resources/main/embedded")
}

elide {
    mode = BuildMode.PRODUCTION

    server {
        ssr(EmbeddedScriptLanguage.JS) {
            bundle(project(":example:fullstack:node"))
        }
    }
}
