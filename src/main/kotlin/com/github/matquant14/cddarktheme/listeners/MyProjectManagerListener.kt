package com.github.matquant14.cddarktheme.listeners

import com.github.matquant14.cddarktheme.services.MyProjectService
import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.project.ProjectManagerListener

internal class MyProjectManagerListener : ProjectManagerListener {

    @Deprecated("Deprecated in Java")
    override fun projectOpened(project: Project) {
        project.service<MyProjectService>()
    }
}
