FROM openjdk:21
COPY build/libs/caprj240521-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "--enable-preview", "app.jar"]