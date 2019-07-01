pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building.'
        sh 'chmod +x ./quickstart/gradlew'
        sh './quickstart/gradlew build'
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
        sh './quickstart/gradlew assemble'
      }
    }
    stage('Unit Test') {
      steps {
        sh './quickstart/gradlew test'
      }
    }
  }
}