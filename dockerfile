FROM openjdk:11-jre

WORKDIR /app

COPY target/myblog-0.0.2-SNAPSHOT.jar /app/app.jar

CMD ["java", "-jar", "/app/app.jar"]

