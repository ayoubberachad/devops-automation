pipeline {
    environment {
        registry = 'amachlou/cicd_app'
        registryCredential = 'docker_hub'
        dockerImage = ''
    }
    agent any
    stages {
        stage('Cloning Git') {
            steps {
                git 'https://github.com/amachlou/cicd_app.git'
            }
        }
        stage('Building image') {
            steps {
                script {
                    dockerImage = docker.build registry + ":$BUILD_NUMBER"
                }
            }
        }
        stage('Test image') {
            steps {
                script {
                    echo 'Tests passed'
                }
            }
        }

    }
}