FROM openjdk:17-oracle
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} minion.jar
ENTRYPOINT ["java","-jar","/minion.jar"]