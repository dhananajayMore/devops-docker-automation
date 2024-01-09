FROM openjdk:8
EXPOSE 8080
ADD target/demo-webapp1-0.0.1-SNAPSHOT.jar demo-webapp1.jar
ENTRYPOINT ["java","-jar","demo-webapp1.jar"]