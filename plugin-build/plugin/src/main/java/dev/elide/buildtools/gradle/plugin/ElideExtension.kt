package dev.elide.buildtools.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Property
import org.gradle.api.tasks.Optional
import javax.inject.Inject

@Suppress("UnnecessaryAbstractClass")
public abstract class ElideExtension @Inject constructor(project: Project) {
    companion object {
        const val DEFAULT_OUTPUT_FILE = "template-example.txt"
    }

    private val objects = project.objects

    /** Operating build mode for a given plugin run. */
    @get:Optional public val mode: Property<BuildMode> = objects.property(BuildMode::class.java).value(
        BuildMode.PRODUCTION
    )

    // Example of a property that is optional.
//    val tag: Property<String> = objects.property(String::class.java)

    // Example of a property with a default set with .convention
//    val outputFile: RegularFileProperty = objects.fileProperty().convention(
//        project.layout.buildDirectory.file(DEFAULT_OUTPUT_FILE)
//    )
}
