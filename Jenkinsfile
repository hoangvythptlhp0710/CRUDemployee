pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'mvn test..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying..'
            }
        }
            
    }
}
