package com.art.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project

class CustomPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        addHelloTask(project)
    }

    void addHelloTask (Project project) {
        def map = [description: "Hello task", group: "art", type: DefaultTask]
        project.task(map, "hello") {
            println "Configuration task 'hello'"

            doLast {
                println "execution phase, Action1"
            }

            doFirst {
                println "execution phase, Action2"
            }
            doLast {
                println "execution phase, Action3"
            }
            println "task: $description, group: $group, actions: ${actions.size()}"
            // где наша таска лежит, в каком проекте
            println "path task: $path"
        }
    }
}
