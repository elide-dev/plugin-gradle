@file:Suppress("unused")

package dev.elide.buildtools.gradle.plugin.tasks

import com.github.gradle.node.task.NodeTask
import java.io.File

internal fun String.fixSlashes() =
    replace("\\", "\\\\")

internal val EmbeddedJsBuildTask.outputBundleFile
    get() = File(outputBundleFolder.get(), outputBundleName.get())

internal val EmbeddedJsBuildTask.outputOptimizedFile
    get() = File(outputBundleFolder.get(), outputOptimizedName.get())

internal fun StringBuilder.appendLine(element: String = ""): StringBuilder =
    append(element).append("\n")

internal fun File.child(name: String) =
    File(this, name)

internal operator fun File.div(name: String) =
    child(name)

@Suppress("UnstableApiUsage")
internal fun NodeTask.setNodeModulesPath(path: String) =
    environment.put("NODE_PATH", path)

@Suppress("UnstableApiUsage")
internal fun NodeTask.setNodeModulesPath(folder: File) =
    environment.put("NODE_PATH", folder.normalize().absolutePath)
