pipeline {
    agent any
//    environment {
//        JAVA_HOME = "/usr/lib/jvm/java-21-openjdk-amd64"
//    }
    stages {
        stage('GetProject') {
            steps {
                git 'https://github.com/Om-i/CT5171_war21_335.git'
            }
        }
        stage('Package') {
            steps {
                sh 'mvn clean'
                sh 'mvn package'
            }
        }
        stage('Run') {
            steps {
//                sh 'mvn spring-boot:run -Dspring-boot.run.arguments="--server.port=8082"'
                sh 'java -jar ./target/CT5171_war21_335.war'
            }
        }
    }
}
