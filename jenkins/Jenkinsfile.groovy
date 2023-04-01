// pipeline {
//     agent any 
//     stages {
//         stage('Build') { 
//             steps {
//                 echo("sadasdasd") 
//             }
//         }
//         stage('Test') { 
//             steps {
//                 echo("sadasdasd") 
//             }
//         }
//         stage('Deploy') { 
//             steps {
//                 echo("sadasdasd") 
//             }
//         }
//     }
// }


pipeline {
    agent any
    stages {
        stage('Print Payload') {
            steps {
                sh '''
                    echo "Payload:"
                    echo $GITHUB_PAYLOAD
                '''
            }
        }
    }
}




