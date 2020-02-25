# For Java 8, try this
FROM openjdk:8-jdk-alpine

# For Java 11, try this
#FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/CitizenDetailAPI.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/CitizenDetailAPI.jar /opt/app/CitizenDetailAPI.jar
COPY ${JAR_FILE} citizendetailAPI.jar

# java -jar /opt/app/CitizenDetailAPI.jar
ENTRYPOINT ["java","-jar","citizendetailAPI.jar"]

## sudo docker run -p 9090:9090 -t docker-spring-boot:1.0
## sudo docker run -p 80:8080 -t docker-spring-boot:1.0
## sudo docker run -p 443:8443 -t docker-spring-boot:1.0