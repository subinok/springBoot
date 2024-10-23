FROM openjdk:17-jdk-slim

WORKDIR /app

COPY target/*.jar app.jar

RUN mkdir -p /var/log/edu && chmod 777 /var/log/edu

ENTRYPOINT ["java", "-jar", "/app/app.jar"]

