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

    }
    stage('Sonar Analysis') {
    steps {
        sh '''
        mvn sonar:sonar \
        -Dsonar.projectKey=YOUR_PROJECT_KEY \
        -Dsonar.organization=YOUR_ORG \
        -Dsonar.host.url=https://sonarcloud.io \
        -Dsonar.token=$SONAR_TOKEN
        '''
    }
}
}