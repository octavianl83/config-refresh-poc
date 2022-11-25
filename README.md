# config-refresh-poc

This repo is a demo of how config-cloud from spring can be used in microservices arhitecture, in order to get the configuration from local or from remote(git) location.


## Prerequisites

In order to run the poc you have to install pache kafka.
* install docker desktop on windows machine 
* go to spring-cloud-config-server
* in terminal command line enter this command: docker-compose up -d
![image](https://user-images.githubusercontent.com/111740580/203080083-6c035d5a-c7b6-40d2-ada9-f2babf695c8e.png)

* a docker image with apache kafka will be created and run

Docker desktop should have the apache kafka started.
Below print screen from my envrioenment:

![image](https://user-images.githubusercontent.com/111740580/203077598-2460b5a3-3582-4bad-99cf-b60c8f608407.png)

![image](https://user-images.githubusercontent.com/111740580/203077716-bccc4b16-0312-45ca-95ef-1014a2f9dafc.png)

## Configuration

### There are 5 microservices
* naming-server - eureka name server
* limit-service configured to get configuration from a spring-cloud-config-server that fetch the configuration from local(disk)
* limitgit-service configured to get configuration from a spring-cloud-config-server-git that fetch the configuration from remote(git)
* spring-cloud-config-server - cloud server configured to get configuration files from local(disk)
* spring-cloud-config-server-git - cloud server configured to get configuration files from remote(git)

### Configuration files
* the local configuration files are located in git-localconfig-repo folder.
In the spring-cloud-config-server you have the application.properties file and you have to modify the path to the git-localconfig-repo
The configuration file contains my path (please change accordingly):
spring.cloud.config.server.git.uri=file:///C:/Users/lilao/IdeaProjects/springboot/git-localconfig-repo

* the remote configuration files are located in git repo config-repo

* in order to access a different file we need to setup the profile on the client microservice (by default is dev)
* In application.properties:

spring.profiles.active=dev

spring.cloud.config.profile=dev

### Starting the microservices

+ start the naming-server
+ start spring-cloud-config-server
+ start spring-cloud-config-server-git
+ start limit-service
+ start limit-service-git


### Check configuration modification in microservice api

* Check local modification propagation:
    - Check the API values in microservice: http://localhost:8200/limits-db
    - In the local folder git-localconfig-repo change values from file limits-service-db-dev.properties
    - Save them
    - Wait for 10 seconds
    - Check again the API values:  http://localhost:8200/limits-db



### Documentation:
https://spring.io/guides/gs/centralized-configuration/
