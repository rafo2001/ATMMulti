FROM mcr.microsoft.com/openjdk/jdk:17-ubuntu as base
EXPOSE 8080
ADD target/getTasa-service.jar getTasa-service.jar
ENTRYPOINT [ "java", "-jar", "/getTasa-service.jar" ]