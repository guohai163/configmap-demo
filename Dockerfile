FROM openjdk:11

COPY target/*.jar /data/program.jar
COPY src/main/resources/bootstrap.yaml /data/conf/bootstrap.yaml

EXPOSE 8081

CMD ["java","-jar","/data/program.jar","--spring.cloud.bootstrap.location=/data/conf/bootstrap.yaml"]