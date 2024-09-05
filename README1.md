To set up a CI/CD pipeline using AWS, Jenkins, and CodeDeploy with Jenkins running on a separate server from the application, follow these steps:

1. Setup Jenkins Server
Provision Jenkins Server:

Launch an EC2 instance (e.g., t2.micro) for Jenkins.
Install Jenkins on the instance. You can follow the official Jenkins installation guide for AWS.
Install Required Plugins:

Go to Jenkins Dashboard > Manage Jenkins > Manage Plugins.
Install the following plugins:
AWS CodeDeploy Plugin
Git Plugin
Docker Plugin (if using Docker)
Pipeline Plugin
Configure Jenkins:

Go to Jenkins Dashboard > Manage Jenkins > Configure System.
Under the AWS CodeDeploy section, provide AWS credentials (Access Key ID and Secret Access Key).
Save the configuration.
2. Setup AWS CodeDeploy
Create an Application in CodeDeploy:

Go to the AWS CodeDeploy Console.
Click on "Create application".
Choose "EC2/On-premises" as the compute platform.
Name the application (e.g., MyApp).
Create a Deployment Group:

In the CodeDeploy console, select your application and click on "Create deployment group".
Choose the deployment type (e.g., In-place or Blue/Green).
Create an IAM role with the necessary permissions for CodeDeploy to access EC2 instances.
Select the role and configure deployment settings.
Install CodeDeploy Agent on EC2 Instances:

Launch EC2 instances for your application.
Install the CodeDeploy agent on these instances. You can follow the official CodeDeploy installation guide.
3. Setup Application Deployment
Prepare Application:
