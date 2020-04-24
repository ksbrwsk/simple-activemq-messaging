# simple-activemq-messaging

#### A simple Spring Boot application using Spring Boot with ActiveMQ Message Broker

**Prequisites:**

* Java 14
* [Apache Maven](https:http://maven.apache.org/)
* [Apache ActiveMQ](https://activemq.apache.org/) Message Broker

You can download ActiveMQ on the above website, or if you have Docker installed,
grab an image from Docker Hub and run the image. 
```bash
docker pull rmohr/activemq
docker run -p 61616:61616 -p 8161:8161 rmohr/activemq
```

## How to build and run

Assuming Java, Maven and ActiveMQ are already installed on your local machine

```bash
mvn clean package
```

the producer application

```bash
cd producer
mvn spring-boot:run
```

or

```bash
cd producer
java -jar target/producer-0.0.1-SNAPSHOT.jar
```

the consumer application

```bash
cd consumer                              
mvn spring-boot:run
```

or

```bash
cd consumer
java -jar consumer-0.0.1-SNAPSHOT.jar
```
create and send a message

```bash
curl -i http://localhost:8080/producer/YourMessage
```
