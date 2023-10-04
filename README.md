Ministry of Information Technology and Communication Letter Management System

# How To Use
Clone git repository
Make Sure to have prerequisites
Run Java

## Regarding Schema please refer to 'roll based schema.jpg'
# Developer

Mohammad Azim Ebrahemi

## Project Modules
below Module are implemented in this project

1- Users
2- User Management
3- Letters
4- Requests
5- Approvals and workflows
6- Organizations
7- Permissions
8- Roles
9- Management
10- Letter Management

## Permissions and Roles

ROLE AND PERMISSION
The concept behind the role and permissoin is like below

First we create role for an organization or ministry
Second we seed all permission from database seeder (permissionSeeder)
Third we create role and give required permission to role
role have many permisison and permisison has is related to an gurad
Every user has role and base on role we check the user permission in ability middleware
Implementation of ever permission is written in sperate policy bcz of easy management
User can have permission directly or via a role
By defualt super_admin user have all permissions
Permission are checking in every API request, if user has not permisison then the called api shows that you don't have sufficient permission
there are some public route that user can access them without any permission
Permissions are managent based on JWT
### Main Poinsts considered in this project
User ACL
Permisson managent for each request using middlewares
Workflow automation
Process the Request using the queuable interface to avoid missing the request
Load balancing
Using the process queue to manage the urgentnesss of request
Considering the security risk and attacks by resolving the vulnebrities
Manager Request troputs
Implementing JWT for Permissions
Wrote the migration scripts to easy managing the databse tables
Implement The Rest API architecture

## API Documents and formats 
https://documenter.getpostman.com/view/20496683/2s9YJdWhVJ
