# java jkd 17
FROM openjdk:17-jdk-slim-buster

# Set port number
EXPOSE 8080

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/register-mvc-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run on container startup
CMD ["java", "-jar", "app.jar"]

