FROM ghcr.io/namnextx/java-based-image:v1.0.0

ARG JAR_FILE=target/*.jar

# cd /opt/app
WORKDIR /opt/app


# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} app.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","app.jar"]