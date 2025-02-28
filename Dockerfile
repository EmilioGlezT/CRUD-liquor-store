FROM openjdk:17-jdk-slim

WORKDIR /app

COPY build/libs/*.jar app.jar

# Exponer el puerto en el que corre la aplicación (ajústalo si es necesario)
EXPOSE 8080

# Definir el comando para ejecutar la aplicación Spring Boot
ENTRYPOINT ["java", "-jar", "app.jar"]
