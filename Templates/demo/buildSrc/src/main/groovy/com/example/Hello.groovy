package com.example
import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 @author abc12345131
 @create 2023/5/25-19:37
 */
class Hello implements Plugin<Project>{
    @Override
    void apply(Project project) {
        project.getTasks().register("hello") {
            doLast {
                println("hello world")
            }
        }
    }
}
