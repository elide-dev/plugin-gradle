@file:Suppress(
    "DSL_SCOPE_VIOLATION",
)

val kotlinVersion = "1.8.21"

plugins {
    `kotlin-dsl`
    `kotlin-dsl-precompiled-script-plugins`
}

dependencies {
    api(kotlin("gradle-plugin"))
    api(libs.plugin.kotlin.allopen)
    api(libs.plugin.kotlin.noarg)
    api(libs.plugin.kover)
    api(libs.plugin.detekt)
    api(libs.plugin.sonar)
    api(libs.plugin.testLogger)
    api(libs.plugin.buildConfig)
    api(libs.plugin.versionCheck)
    implementation(libs.plugin.kotlinx.serialization)
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
