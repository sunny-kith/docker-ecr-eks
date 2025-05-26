# Docker - AWS ECR - AWS EKS

## Docker

```
docker build -t skith/docker-ecr-eks .
docker run -d -p 8080:8080 skith/docker-ecr-eks
```

## AWS ECR

1. Create an ECR repository:
   - Go to the AWS console and search for “Elastic Container Registry” 
   - Enter your desired repository name and click “Create Repository”

Repository name: `skith/docker-ecr-eks`

2. Create an IAM user:
   - In the AWS console, search for “IAM Users” 
   - Click “Create User” and provide a username, click "Next"
   - Add the user to a group with specific permissions (administrator access policy for development purpose)

Username: `skith`
Group name: `administrators` (with "AdministratorAccess" policy)

3. Generate the access and secret key of the user that we created:
   - Open the user that we created and click “create access key” 
   - Select “CLI” as the use case
   - Download the CSV file containing the access key and secret key for future reference. These keys will be needed when working with GitHub

Create Github secrets: `AWS_ACCESS_KEY_ID` and `AWS_SECRET_ACCESS_KEY`

----

SOURCE: https://dlmade.medium.com/ci-cd-with-github-action-and-aws-eks-5fd9714010cd