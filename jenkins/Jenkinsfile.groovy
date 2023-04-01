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
        stage('Show Latest Commit Message') {
            steps {
                sh '''
                    git fetch
                    git log -1 --pretty=%B
                '''
            }
        }
    }
}




