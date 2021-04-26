package com.github.matquant14.cddarktheme.services

import com.github.matquant14.cddarktheme.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
