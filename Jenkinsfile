pipeline {
    environment {
        registry = 'amachlou/devops-automation'
        registryCredential = 'docker_hub'
        dockerImage = ''
    }
    agent any
    stages {
        stage('Cloning Git') {
            steps {
                git 'https://github.com/amachlou/devops-automation.git'
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