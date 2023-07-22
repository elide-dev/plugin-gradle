@file:Suppress("UnstableApiUsage")

import build.less.plugin.settings.buildless

pluginManagement {
    repositories {
        maven("https://maven.pkg.st/")
        maven("https://gradle.pkg.st/")
        maven("https://elide-snapshots.storage-download.googleapis.com/repository/v3/")
    }
}

plugins {
    id("build.less") version("1.0.0-beta1")
    id("com.gradle.enterprise") version("3.13.4")
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.6.0")
}

dependencyResolutionManagement {
    repositoriesMode.set(
        RepositoriesMode.FAIL_ON_PROJECT_REPOS
    )
    repositories {
        maven("https://maven.pkg.st/")
        maven("https://gradle.pkg.st/")
        maven("https://elide-snapshots.storage-download.googleapis.com/repository/v3/")
    }
    versionCatalogs {
        create("libs") {
            from(files("../gradle/libs.versions.toml"))
        }
    }
}

rootProject.name = ("dev.elide.buildtools.gradle")

include(
    ":plugin"
)

val cachePassword: String? by settings
val cachePush: String? by settings
val remoteCache = System.getenv("GRADLE_CACHE_REMOTE")?.toBoolean() ?: false
val localCache = System.getenv("GRADLE_LOCAL_REMOTE")?.toBoolean() ?: true

buildless {
    // nothing at this time
}

enableFeaturePreview("STABLE_CONFIGURATION_CACHE")
enableFeaturePreview("GROOVY_COMPILATION_AVOIDANCE")
