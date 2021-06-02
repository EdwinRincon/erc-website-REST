# syntax=docker/dockerfile:1

FROM openjdk:8-jdk-alpine
ADD target/erc-website-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]