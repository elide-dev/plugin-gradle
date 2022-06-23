package dev.elide.buildtools.gradle.plugin

import dev.elide.buildtools.gradle.plugin.tasks.TemplateExampleTask
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Test
import java.io.File


class ElidePluginTest {

    @Test
    fun `plugin is applied correctly to the project`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("dev.elide.buildtools.gradle.plugin")

        assert(project.tasks.getByName("templateExample") is TemplateExampleTask)
    }

    @Test
    fun `extension templateExampleConfig is created correctly`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("dev.elide.buildtools.gradle.plugin")

        assertNotNull(project.extensions.getByName("templateExampleConfig"))
    }

    @Test
    fun `parameters are passed correctly from extension to task`() {
        val project = ProjectBuilder.builder().build()
        project.pluginManager.apply("dev.elide.buildtools.gradle.plugin")
        val aFile = File(project.projectDir, ".tmp")
        (project.extensions.getByName("templateExampleConfig") as ElideExtension).apply {
            tag.set("a-sample-tag")
            message.set("just-a-message")
            outputFile.set(aFile)
        }

        val task = project.tasks.getByName("templateExample") as TemplateExampleTask

        assertEquals("a-sample-tag", task.tag.get())
        assertEquals("just-a-message", task.message.get())
        assertEquals(aFile, task.outputFile.get().asFile)
    }
}
