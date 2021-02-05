#!/usr/bin/env groovy
pipeline {
    agent any
    
    environment {
        SERVER = 'http://10.250.1.5:4444'
        BROWSER = 'firefox'
        HEADLESS VALUE = 'false'
    }

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
                multiple_test()
                withGradle {
                    sh './gradlew clean test'
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

def multiple_test(){
    withGradle {
        sh './gradlew test -Premote_server=${SERVER} -Pbrowser=firefox -Pheadless=${HEADLESS_VALUE}' 
        sh './gradlew test -Premote_server=${SERVER} -Pbrowser=chrome -Pheadless=${HEADLESS_VALUE}'
    }
}
