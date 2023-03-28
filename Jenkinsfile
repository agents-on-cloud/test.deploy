// pipeline {
//     agent any
//     stages {
//         stage('Debug') {
//             steps {
//                 echo "Webhook payload: ${params}"
//                 echo "Webhook event type: ${env.GIT_EVENT_TYPE}"
//                 echo "Git tag: ${env.GIT_TAG}"
//             }
//         }
//         stage('Build') {
//             steps {
//                 echo 'make package'
//             }
//         }
//         stage('Test') {
//             steps {
//                 echo 'make check'
//             }
//         }
//         stage('Deploy') {
//             when { expression { env.GIT_EVENT_TYPE == 'tag' } }
//             steps {
//                 echo "Deploying only because this commit is tagged with ${env.GIT_TAG}"
//                 // sh 'make deploy'
//             }
//         }
//     }
// }



pipeline {
    agent any
    triggers {
        webhookTrigger(
            events: [
                tags('v.*')
            ]
        )
    }
    stages {
        stage('Retrieve Payload') {
            steps {
                withWebhookPayload([binding('payload', 'json')]) {
                    echo "Webhook payload: ${payload}"
                }
            }
        }
        stage('Process Payload') {
            steps {
                echo "Webhook event type: ${env.GIT_EVENT_TYPE}"
                echo "Git tag: ${env.GIT_TAG}"
            }
        }
    }
}
