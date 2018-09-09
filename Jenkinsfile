pipeline {
    agent {
        docker {
                image 'openjdk:8u171-alpine3.7'
                args '-p 8080:8080'
        }
    }
    stages {
        stage('Build Project') {
            steps {
                echo 'Building .jar'
                sh './gradlew build'
            }
        }
        stage('Deploying') {
            steps {
                echo 'Deploying'
                sh './gradlew run'
            }
        }
    }
}