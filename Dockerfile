FROM openjdk:17
EXPOSE 8080
ADD target/devops-integartion.jar devops-integartion.jar
ENTRYPOINT ["java","-jar","/devops-integartion.jar"]