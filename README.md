## Activité Pratique N°7 :
#### Consiste sur la creation d'une app qui offre des fonctionnalités d'authentification sécurisée via Google, GitHub et Keycloak, et elle est déployée sur Docker pour faciliter la gestion et la portabilité. Cela permet aux utilisateurs d'accéder à l'application de manière sécurisée en utilisant les fournisseurs d'identité de leur choix, tout en offrant une expérience fluide et sécurisée.
## Architecture :  
![Achitecture](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/7b82f01a-304b-4c29-b488-17df3f7031e3)  


## Via Thymleaf :  
### Création d'un Filter :  
![FilterTh](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/35274e18-a9fb-4818-8b00-77499598fc71)  
### Logique Metier :  
![LogiqueMetier](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/05b27955-ff9a-40ab-a83a-ac1a06f3b750)  
### Authentification via Google :  
#### Creation des identifiants :  
![AuthGoogle](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/0d2020a4-717e-4859-a401-e2ebd2801153)  
![proGoogle](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/fce5d876-6274-470a-833b-788882859e1a)  
### Auth via Github :  
![AuthGithub](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/dc705933-d406-40c1-b81e-f559df64e198)  
![proGithub](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/23c5c53e-a854-4eb4-a25b-97e03d1ec2cd)  
### Authentification via Keycloak :  
#### Création d'un Realm :  
![Realm](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/e8354275-88b5-41c4-9c6b-b97672efdcc7)  
#### Création d'un Client :  
![client](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/4e84b152-3814-4662-b334-436dd5c50041)  
#### Création d'utilisateurs et roles :  
![users](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/cda926f7-83d2-4e81-8299-6e6c4315ef44)  
#### Tester le Token :  
![tester le fonctionnement keycloak](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/265528d1-9a14-47de-8346-ee96dce2c43d)  
#### Ajouter Le role a Token :  
![AjouterRoleToken](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/b8dfabe4-0e4a-41e9-a811-40d34e3a3b85)  
#### Contenu d'access Token :  
![Jwt IO](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/0f7223f1-b2aa-406a-b752-e81dba9013dc)  
#### Integration :  
![proKeycloak](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/d67b4966-43b9-48fa-9835-70278a9efb4f)  
#### Screens Th part :  
![Authentication](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/208af133-4917-4ce8-be23-47bd1a87b222)  
![Customers](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/f95231c0-abdf-494b-8d7c-353907f70881)  
![Products](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/1e68042b-0b4c-4bb7-b871-6558da94b80e)  


## Via Angular :  
### Création d'un Client (sans Client authentication (x)client-secret)
![clientAngular](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/555975c5-b74a-43a1-b1fb-07a82e73b39b)  
### Integration :  
![IntagrationKeycloakAngular](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/96d8dec0-e59b-4925-8aec-aecffc2d080b)  


## deployment sur docker :  
### Création des DockerFiles :  
#### Inventory Service et Thymeleaf :  
![Dockerfile th](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/fad2dd5b-7bdf-4224-9b20-7cc8c2a5b96e)  
#### Angular-app :  
![Dockerfile Angular](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/83aed6ca-3e24-47c1-a2e9-bb5050764c25)  
### Fichier docker-compose :  
![Dockercompose](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/40606a73-148e-4c91-a8e6-9e25be347b3f)  
### Lancer le fichier docker-compose : =>docker compose up -d --build  
![startDockercompose](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/77311f96-0971-4ade-9ad7-e61ff02fe817)  


## Resolution du probleme Cors (in Angular part) :  
![Resolution Cors Problem](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/b38b33e2-7782-4970-b650-5ee4dd6bbb74)  
## Screen De l'app aprés le deployment : 
![FinalScreen](https://github.com/Bouchghel/S-curit-Oauth2-OIDC-JWT-Keycloak/assets/93221225/45eca713-732c-4bc3-beaa-22a4dfcb3641)  

