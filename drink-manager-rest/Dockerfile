FROM java:8
VOLUME /tmp
EXPOSE 8080
ADD target/drink-manager-rest-0.0.1-SNAPSHOT.jar drink-manager-rest-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","drink-manager-rest-0.0.1-SNAPSHOT.jar"]