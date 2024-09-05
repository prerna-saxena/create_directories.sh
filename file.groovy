pipeline {
    agent any
    
    environment {
        AWS_CREDENTIALS = 'aws-credentials-id'  // Configure AWS credentials in Jenkins
        APPLICATION_NAME = 'MyApp'
        DEPLOYMENT_GROUP = 'MyDeploymentGroup'
    }
    
    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from Git
                git 'https://github.com/your-repo.git'
            }
        }
        stage('Build') {
            steps {
                // Build your application (if needed)
                sh './build.sh'
            }
        }
        stage('Package') {
            steps {
                // Package the application for deployment
                sh 'zip -r myapp.zip *'
            }
        }
        stage('Deploy') {
            steps {
                script {
                    // Upload the package to S3 (or another artifact store)
                    sh 'aws s3 cp myapp.zip s3://your-bucket/myapp.zip'
                    
                    // Trigger a deployment in CodeDeploy
                    sh '''
                    aws deploy create-deployment \
                      --application-name $APPLICATION_NAME \
                      --deployment-group-name $DEPLOYMENT_GROUP \
                      --revision '{"revisionType":"S3","s3Location":{"bucket":"your-bucket","key":"myapp.zip","bundleType":"zip"}}'
                    '''
                }
            }
        }
    }
}
