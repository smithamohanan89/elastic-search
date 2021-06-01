package com.github.smithamohanan89.elasticsearch.services

import com.github.smithamohanan89.elasticsearch.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
