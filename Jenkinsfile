pipeline {
    agent any
    stages {
        stage('Get payload data') {
            steps {
               echo "Payload: ${env.payload}"
                echo "Event type: ${env.GIT_EVENT_TYPE}"
                echo "Branch name: ${env.GIT_BRANCH}"
                echo "Tag name: ${env.GIT_TAG}"
                // Add more steps as needed for testing, deployment, etc.
            }
        }
        // Add more stages as needed for other events, such as push, pull request, etc.
    }
}