FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY build/libs/workout-api-0.0.1.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
