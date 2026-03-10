pipeline {
    agent {
        docker {
            image 'selenium/standalone-chrome:latest'
        }
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/yulyazhdanova/autotests_web_patterns.git'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn clean test'
            }
        }
    }
}