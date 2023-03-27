pipeline {
    agent any

    tools{
        maven 'Maven 3.6.3'
    }

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
