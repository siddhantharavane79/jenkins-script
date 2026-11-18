pipeline {
    agent any

    stages {
        stage('pull') {
            steps {
              git branch: 'main', url: 'https://github.com/siddhantharavane79/CloudWatch-SNS'   
            }
        }

        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}