FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR eureka-server
COPY --from=build target/*.jar eureka-server.jar
ENTRYPOINT ["java", "-jar", "eureka-server.jar"]