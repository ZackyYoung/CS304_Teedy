pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('PMD') {
            steps {
                sh 'kubectl set image deployments/hello-node container-name=image-id'
            }
        }
    }

}