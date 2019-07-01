pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building.'
        sh 'cd /home/ubuntu/RH_at09_java/quickstart'
        sh './gradlew clean build'
      }
    }
    stage('Test') {
      steps {
        echo 'Testing.'
      }
    }
    stage('Deploy') {
      steps {
        echo 'Deploying.'
      }
    }
    stage('Assemble') {
      steps {
        sh './gradlew assemble'
      }
    }
    stage('Unit Test') {
      steps {
        sh './gradlew test'
      }
    }
  }
}