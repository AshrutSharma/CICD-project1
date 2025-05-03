pipeline {
    agent any

    environment {
        ARTIFACTORY_URL = 'http://artifactory:8082/artifactory'
        ARTIFACTORY_CREDENTIALS_ID = 'artifactory-creds'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'develop', url: 'https://github.com/AshrutSharma/CICD-project1.git'
                git credentialsId: '50dea1ff-fcdf-4a1e-ac02-3286fef44bad', url: 'https://github.com/AshrutSharma/CICD-project1.git', branch: 'develop'
            }
        }

        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Publish Artifact') {
            steps {
                withCredentials([usernamePassword(credentialsId: "${ARTIFACTORY_CREDENTIALS_ID}", usernameVariable: 'USER', passwordVariable: 'PASS')]) {
                    sh "./gradlew publish -Partifactory_user=$USER -Partifactory_password=$PASS"
                }
            }
        }
    }
}
