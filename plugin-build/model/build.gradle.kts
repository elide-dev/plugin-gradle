
plugins {
    kotlin("jvm")
}

dependencies {
    api(kotlin("gradle-plugin"))
    implementation(kotlin("stdlib-jdk7"))
    implementation(libs.kotlinx.serialization.core)
    implementation(libs.kotlinx.serialization.json)
    implementation(libs.kotlinx.serialization.protobuf)

    testImplementation(libs.junit)
    testImplementation(libs.truth)
    testImplementation(libs.truth.proto)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}
