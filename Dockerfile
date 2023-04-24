FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD build/libs/REST-0.0.1-SNAPSHOT.jar springbootapp.jar

CMD ["java","-jar","springbootapp.jar"]