pipeline {
    agent any
    stages {
        stage('Build Project') {
            steps {
                echo 'Start Application'
                sh './gradlew run'
            }
        }
        stage('Done!') {
            steps {
                echo 'Done :)'
                echo 'Application running at: localhost:8081'
            }
        }
    }
}