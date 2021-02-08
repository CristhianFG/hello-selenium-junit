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
                    sh './gradlew clean test -Premote_server=${SERVER} -Pbrowser=${BROWSER} -Pheadless=${HEADLESS_VALUE}'
                    sh './gradlew checkstyleMain -Premote_server=${SERVER} -Pbrowser=${BROWSER} -Pheadless=${HEADLESS_VALUE}'
                    sh './gradlew checkstyleTest -Premote_server=${SERVER} -Pbrowser=${BROWSER} -Pheadless=${HEADLESS_VALUE}'
                }
            }
            post {
                always {
                    junit 'build/test-results/**/TEST-*.xml'
                    recordIssues{
                        enabledFailure: true, aggregatingResults: true,
                        tools: [java(), checkStyle(pattern: 'build/reports/checkstyle/*_xml', reportEncoding: 'UTF-8')]
                    }
                    publishHTML {target: [
                        reportDir: 'build/reports/checkstyle/',
                        reportFiles: 'main.html',
                        reportName: 'Report checkstyle'
                    ]}
                    publishHML {target: [
                        reportDir: 'build/reports/checkstyle/',
                        reportFiles: 'test.html',
                        reportName: 'Report checkstyle'
                    ]}
                }
            }
        }
    }
}
