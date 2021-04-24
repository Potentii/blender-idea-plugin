package com.github.potentii.blenderideaplugin.services

import com.github.potentii.blenderideaplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
