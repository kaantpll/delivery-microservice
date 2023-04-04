FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR email-server
COPY --from=build target/*.jar email-server.jar
ENTRYPOINT ["java", "-jar", "email-server.jar"]