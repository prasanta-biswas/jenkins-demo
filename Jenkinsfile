pipeline{
    stages{
        stage('Build') {
                steps{
                    step{
                        sh 'mvn clean build -Dmaven.test.skip=true'
                    }
                }
            }
        stage('Test'){
            steps {
                step{
                    sh mvn clean test
                }
            }
        }
        stage('Deploy'){
            steps {
                step{
                    sh mvn clean deploy
                }
            }
        }
    }
}
