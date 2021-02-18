#!/usr/bin/env groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                withGradle {
                     sh './gradlew assemble'
                }
            }
        }
        stage('Test') {
            steps {
                withGradle {
                    sh './gradlew clean test '
                    sh './gradlew check'                
                }
            }
            post {
                always {
                    junit 'build/test-results/**/TEST-*.xml'
                    recordIssues(
                        enabledForFailure: true,
<<<<<<< HEAD
                        tools: checkStyle(pattern: 'build/reports/checkstyle/*.xml')
=======
                        tools: checkstyle(pattern: 'build/reports/checkstyle/*.xml')
>>>>>>> 78cf87e00f3910509b4cbcc95074551206d58d1f
                    )
                }
            }
        }
    }
}
