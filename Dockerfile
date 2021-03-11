FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD /build/libs/jclo_rest-0.0.1-SNAPSHOT.jar jclo_rest.jar
ENTRYPOINT ["java","-jar","/jclo_rest.jar"]