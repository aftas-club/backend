FROM maven:3.9-amazoncorretto-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

FROM openjdk:21
WORKDIR /app
COPY --from=build app/target/aftas-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar", "/app/app.jar"]