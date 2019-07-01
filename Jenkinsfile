pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        echo 'Building.'
        sh 'chmod +x ./quickstart/gradlew'
        //sh './quickstart/gradlew build -p quickstart/'
      }
    }
    stage('Tests') {
      parallel {
        stage('Unit Test 1') {
          steps {
             sh './quickstart/gradlew test -p quickstart/'
          }
          post {
            always{
              junit "quickstart/build/test-results/test/*.xml"
              archiveArtifacts 'quickstart/build/reports/tests/test/*'
            }
          }
        }
        stage('Unit Test 2') {
          steps {
            sh './quickstart/gradlew test -p quickstart/'
          }
        }
      }
    }
    stage('Check') {
      steps {
        echo 'Checking.'
        sh './quickstart/gradlew check -p quickstart/'
      }
    }

    stage('Assemble') {
      steps {
        sh './quickstart/gradlew assemble -p quickstart/'
        archiveArtifacts 'quickstart/build/libs/*.jar'
      }
    }
    stage('Unit Test') {
      steps {
        sh './quickstart/gradlew test -p quickstart/'
      }
    }
  }
  post {
    always {
      echo 'This is a post action.'
      emailext attachmentsPattern: 'quickstart/reports/tests/**/*', body: 'The test has finished', subject: 'TEST', to: 'enrique.humana@gmail.com'
    }
  }
}