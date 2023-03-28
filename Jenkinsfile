pipeline {
    agent any
    stages {
        stage('Tag event') {
            when {
                expression {
                    return env.GIT_EVENT_TYPE == 'push'
                }
            }
            steps {
                echo "Tag name: ${env.GIT_TAG}"
                // Add more steps as needed for testing, deployment, etc.
            }
        }
        // Add more stages as needed for other events, such as push, pull request, etc.
    }
}