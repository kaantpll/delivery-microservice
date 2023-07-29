### Microservice project in Spring boot.
I used the queue structure to deliver the order event to other services. All services communicate with each other.

### Technology I use
- Spring Boot
- Kafka
- PostgreSQL
- Spring Cloud
- Docker

## Running the application in local
```shell
mvn spring-boot:run
```

## Dockerize Services
```bash
$ docker build -t image_name . 
```

## Running Docker Compose 
```bash
$ docker-compose up 
```
