pipeline {

    agent any
    tools {
        maven 'Maven_3.9'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Sonar Analysis') {
            steps {
                sh '''
                mvn sonar:sonar \
                -Dsonar.projectKey=SONAR_TOKER \
                -Dsonar.organization=YOUR_ORG \
                -Dsonar.host.url=https://sonarcloud.io \
                -Dsonar.token=$ebba4a9165e3c3759fe416582b28728dc1bf837b
                '''
            }
        }

    }
}