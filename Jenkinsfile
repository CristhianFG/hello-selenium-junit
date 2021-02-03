#!/usr/bin/env groovy
pipeline {
    agent any

    stages {
        stage('Setup') {
            steps {
                git url: 'https://github.com/CristhianFG/hello-selenium-junit.git' 
           }
        }
        stage('Build') {
            steps {
                withGradle {
                    sh './gradlew assemble'
                    sh './gradlew build'
                }    
            }
        }
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
                    sh './gradlew clean test'
                }
            }
        }
    }
}
