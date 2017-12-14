FROM java:8
MAINTAINER Eva Lopez Puente, Lorena Martin Tejera
EXPOSE 8081
VOLUME /tmp
ADD /target/PracticaServerOMDBMySql-0.0.1-SNAPSHOT.jar practicaomdb.jar
ENTRYPOINT ["java","-jar","practicaomdb.jar"]
