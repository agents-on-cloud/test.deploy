pipeline {
    agent any
    stages {
        stage('Debug') {
            steps {
                echo "Webhook payload: ${params.payload}"
                echo "Webhook event type: ${env.GIT_EVENT_TYPE}"
                echo "Git tag: ${env.GIT_TAG}"
            }
        }
        stage('Build') {
            steps {
                echo 'make package'
            }
        }
        stage('Test') {
            steps {
                echo 'make check'
            }
        }
        stage('Deploy') {
            when { expression { env.GIT_EVENT_TYPE == 'tag' } }
            steps {
                echo "Deploying only because this commit is tagged with ${env.GIT_TAG}"
                // sh 'make deploy'
            }
        }
    }
}
