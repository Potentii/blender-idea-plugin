package com.potentii.blender.plugin.idea.services

import com.intellij.openapi.project.Project
import com.potentii.blender.plugin.idea.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
