FROM openjdk:17-jdk-slim-buster
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8080
EXPOSE 80