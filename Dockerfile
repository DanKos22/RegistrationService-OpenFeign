#FROM ubuntu:latest
#LABEL authors="G00397054@atu.ie"
#ENTRYPOINT ["top", "-b"]

FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR the file from the target directory to the container at /app
COPY target/RegistrationService-0.0.1-SNAPSHOT.jar /app

# Make port 8081 available to the world outside this container
EXPOSE 8081

# Run the JAR file when the container launches
CMD ["java", "-jar", "RegistrationService-0.0.1-SNAPSHOT.jar"]