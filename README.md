# config-refresh-poc

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


The configuration file is in git-localconfig-repo.
In the spring-cloud-config-server you have the application.properties file and you have to modify the path to the git-localconfig-repo
The configuration file contains my path (please change accordingly):
spring.cloud.config.server.git.uri=file:///C:/Users/lilao/IdeaProjects/springboot/git-localconfig-repo

If needed mark this folder as git repository with the command: 
* git init


Url to check the values from configuration file:
http://localhost:8200/limits


In application limit-service we have application.properties and here we can change the evnironment:
spring.cloud.config.profile=dev
