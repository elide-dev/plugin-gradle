@file:Suppress(
    "UnstableApiUsage",
    "unused",
    "UNUSED_VARIABLE",
    "DSL_SCOPE_VIOLATION",
)

plugins {
    java
    id("dev.elide.buildtools.plugin")
    alias(libs.plugins.protobuf)
}

elide {
//    message.set("Just trying this gradle plugin...")
}
