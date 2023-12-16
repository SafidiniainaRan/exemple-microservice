FROM openjdk:17-jdk
VOLUME [ "/temp" ]
COPY target/*.jar apps.jar
ENTRYPOINT [ "java","-jar","apps.jar" ]