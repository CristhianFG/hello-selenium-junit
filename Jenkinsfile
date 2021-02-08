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
                        tools: checkstyle(pattern: 'build/reports/checkstyle/*.xml')
                    )
                }
            }
        }
    }
}
