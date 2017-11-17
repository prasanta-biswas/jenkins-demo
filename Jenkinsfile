pipeline{
    stages{
        stage('Build') {
                    sh 'mvn clean build -Dmaven.test.skip=true'
                }
        stage('Test'){
            sh mvn clean test
        }
        stage('Deploy'){
            sh mvn clean deploy
        }
    }
}