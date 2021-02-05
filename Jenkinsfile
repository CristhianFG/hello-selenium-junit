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
                    sh './gradlew clean test -Dbrowser.firefox'
                    sh './gradlew clean test -Dbrowser.chrome'
                }
            }
            post {
                always {
                    junit 'build/test-results/**/TEST-*.xml'   
                }
            }
        }
    }
}
