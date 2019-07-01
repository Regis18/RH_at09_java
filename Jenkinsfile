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