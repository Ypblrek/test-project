FROM openjdk:17-alpine
ARG JAR_FILE=target/spring_boot_Group_C65-0.0.1-SNAPSHOT.jar
RUN mkdir /c65
WORKDIR /c65
COPY ${JAR_FILE} /c65
ENTRYPOINT java -jar /c65/spring_boot_Group_C65-0.0.1-SNAPSHOT.jar
