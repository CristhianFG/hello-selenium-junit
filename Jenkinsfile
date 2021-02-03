#!/usr/bin/env groovy
pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git url: 'https://github.com/CristhianFG/hello-selenium-junit.git' 
                sh './gradlew assemble'
           }
        }
        stage('Test') {
            steps {
                withGradle {
                    sh './gradlew clean test'
                }
            }
        }
    }
}
