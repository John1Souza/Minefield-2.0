# Use uma imagem base do OpenJDK
FROM openjdk:17-jdk-slim

# Copie o JAR da aplicação para o contêiner
COPY target/classes/com/john/minefield20/Application.class /app/minefield20.jar

# Defina o diretório de trabalho
WORKDIR /app

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-jar", "app.jar"]
