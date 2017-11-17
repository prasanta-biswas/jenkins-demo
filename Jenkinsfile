pipeline{
    stages{
        stage('Build') {
               step{
                        sh 'mvn clean build -Dmaven.test.skip=true'
                    }
                }
        stage('Test'){
            step{
                sh mvn clean test
            }
        }
        stage('Deploy'){
            step{
                sh mvn clean deploy
            }
        }
    }
}