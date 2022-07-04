@file:Suppress(
    "UnstableApiUsage",
    "unused",
    "UNUSED_VARIABLE",
    "DSL_SCOPE_VIOLATION",
)

import dev.elide.buildtools.gradle.plugin.BuildMode

plugins {
    kotlin("js")
    alias(libs.plugins.node)
    id("dev.elide.buildtools.plugin")
}

node {
    download.set(false)
}

elide {
    mode.set(BuildMode.PRODUCTION)
}

dependencies {
    implementation(npm("esbuild", libs.versions.npm.esbuild.get()))
    implementation(npm("prepack", libs.versions.npm.prepack.get()))
}
