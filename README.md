# config-refresh-poc

In order to run the poc you have to install pache kafka.
* install docker desktop on windows machine 
* go to spring-cloud-config-server
* in terminal command line enter this command: docker-compose up -d
* a docker image with apache kafka will be created and run

The configuration file is in git-localconfig-repo.
In the spring-cloud-config-server you have the application.properties file and you have to modify the path to the git-localconfig-repo
The configuration file contains my path (please change accordingly):
spring.cloud.config.server.git.uri=file:///C:/Users/lilao/IdeaProjects/springboot/git-localconfig-repo
