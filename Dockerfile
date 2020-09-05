FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /demo
COPY ./target/spring-cloud-*.jar /demo
EXPOSE 8080
CMD java -jar spring-cloud*.jar