FROM openjdk:21
COPY target/MinhaRinha-0.0.1-SNAPSHOT.jar minha-rinha.jar
ENTRYPOINT ["java","-jar","/minha-rinha.jar"]