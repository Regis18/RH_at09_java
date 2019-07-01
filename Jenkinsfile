pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building.'
        sh 'chmod +x ./quickstart/gradlew'
        sh './quickstart/gradlew build -p quickstart/'
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
        sh './quickstart/gradlew assemble -p quickstart/'
      }
    }
    stage('Unit Test') {
      steps {
        sh './quickstart/gradlew test -p quickstart/'
      }
    }
  }
}