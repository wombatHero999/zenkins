# Step 1: Use an official Ubuntu as a base image
FROM ubuntu:latest

# Step 2: Install Java (OpenJDK)
RUN apt-get update && \
    apt-get install -y openjdk-17-jdk && \
    apt-get clean;

# Step 4: Copy the Spring Boot JAR file into the container
COPY target/hello-jenkins.jar hello-jenkins.jar

# Step 6: Set the command to run the JAR file
ENTRYPOINT ["java", "-jar", "/app/my-springboot-app.jar"]
