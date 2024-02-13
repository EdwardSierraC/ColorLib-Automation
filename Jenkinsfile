pipeline {
  agent any

  stages {

      stage('install') {
        steps {
          git branch: 'master', url: 'https://github.com/EdwardSierraC/ColorLib-Automation.git'
        }
      }

    stage('SonarQube analysis') {
        steps {
            withSonarQubeEnv(installationName: 'MySonarQubeServer', credentialsId: 'colorlib-jenkins') {
              bat """
              ./gradlew sonar-project \
                    -Dsonar.projectKey=${"colorlib"} \
                    -Dsonar.host.url=${env.SONAR_HOST_URL} \
                    -Dsonar.login=${env.SONAR_AUTH_TOKEN} \
                    -Dsonar.projectName=${"BaseWebScreenPlay"} \
                    -Dsonar.projectVersion=${BUILD_NUMBER}"
                """
            }
          }
        } //scan

    stage('Build') {
      steps {
        withGradle {
           bat './gradlew clean build --stacktrace -i'
        }
      }
    } // Build
  }
}