FROM openjdk:17-jdk-slim AS build

COPY pom.xml mvnw ./
COPY .mvn .mvn
RUN ./mvnw dependency:resolve

COPY src src
RUN ./mvnw package

FROM openjdk:17-jdk-slim
WORKDIR order-server
COPY --from=build target/*.jar order-server.jar
ENTRYPOINT ["java", "-jar", "order-server.jar"]