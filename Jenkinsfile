pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building.'
        sh 'ls'
        sh 'cd quickstart'
        sh 'ls'
        sh 'cd quickstart'
        sh 'chmod +x gradlew'
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