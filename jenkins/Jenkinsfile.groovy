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
        stage('Print Tag Name') {
            steps {
                sh '''
                    echo "Tag Name:"
                    echo ${GITHUB_REF#refs/tags/}
                '''
            }
        }
    }
}




