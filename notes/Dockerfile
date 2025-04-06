# Use Eclipse Temurin Java 21 JDK base image
FROM eclipse-temurin:21-jdk-jammy AS build

# Set working directory for the build
WORKDIR /app

# Copy everything
COPY . .

# Build the project using the Maven wrapper (mvnw)
RUN ./mvnw clean package -DskipTests

# ------------------------------
# Create a minimal runtime image
# ------------------------------
FROM eclipse-temurin:21-jre-jammy

# Set working directory for the app
WORKDIR /app

# Copy the built jar from the build stage
COPY --from=build /app/target/notes-0.0.1-SNAPSHOT.jar app.jar

# Expose port 8080 (Spring Boot default)
EXPOSE 8080

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]
