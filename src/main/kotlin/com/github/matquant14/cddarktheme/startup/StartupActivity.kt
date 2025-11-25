package com.github.matquant14.cddarktheme.startup

import com.github.matquant14.cddarktheme.services.MyProjectService
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

internal class StartupActivity : ProjectActivity {

    override suspend fun execute(project: Project) {
        // Simply accessing the service initializes it, replacing the old projectOpened behavior
        project.getService(MyProjectService::class.java)
    }
}