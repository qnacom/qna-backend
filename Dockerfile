FROM openjdk:21-slim

ARG JAR_FILE=build/libs/*.jar

COPY ${JAR_FILE} qna-backend.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/qna-backend.jar"]