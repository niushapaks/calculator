FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/calculator-1.0.0-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java", "-jar", "calculator.jar"]