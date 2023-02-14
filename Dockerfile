FROM openjdk:10-jre-slim

WORKDIR /app
COPY ./target/display-console-1.0-SNAPSHOT.jar /app

EXPOSE 8081

CMD ["java", "-jar", "display-console-1.0-SNAPSHOT.jar"]








