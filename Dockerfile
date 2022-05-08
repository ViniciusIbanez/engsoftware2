FROM openjdk:8-jre-slim
WORKDIR /praticandoAPI
COPY target/*.war /praticandoAPI/praticandoAPI-0.0.1-SNAPSHOT.war
CMD java -XX:+UseContainerSupport -Xmx512m -jar praticandoAPI-0.0.1-SNAPSHOT.war



