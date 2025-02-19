# Kafka-Based Cab Booking Application

This is a **Spring Boot application** that simulates a **cab booking system** using **Apache Kafka**. The application follows a **Publisher-Subscriber (Pub-Sub) architecture**, where:

- **Drivers** publish their location updates.
- **Users** subscribe to receive location updates.
- **Kafka** acts as a **message broker** between the driver and the user.

---

## What is Apache Kafka?

Apache Kafka is a **distributed event streaming platform** designed for handling **high-throughput, fault-tolerant, and real-time data streams**. It is widely used for building **scalable event-driven applications**.

### Benefits of Kafka:

- **High Throughput**: Efficiently processes massive real-time data streams.
- **Scalability**: Easily scales by adding more brokers to handle increased data loads.
- **Fault Tolerance**: Ensures data availability via replication across multiple brokers.

### Kafka Architecture Overview:

Kafka is built on a **Publisher-Subscriber (Pub-Sub) model**, where:

- **Producers** publish messages to **topics**.
- **Consumers** subscribe to those topics and receive messages.

#### Key Components:

- **Cluster**: A group of **brokers (servers)** working together to manage streaming data.
- **Brokers**: Individual servers responsible for storing and distributing data.
- **Topics**: Logical categories used to organize messages.
- **Partitions**: Subdivisions within a topic to enable parallel processing.
- **Zookeeper**: A central coordinator that manages broker metadata and leader election.

## Project Overview

### Features:

- **Drivers** can **publish** their real-time location updates.
- **Users** can **subscribe** to receive location updates from Kafka.
- Kafka acts as an **intermediary** ensuring reliable message delivery.

### Tech Stack:

- **Spring Boot** (Backend)
- **Apache Kafka** (Message Broker)
- **Spring Kafka** (Integration)
- **Java** (Language)

## Getting Started

### Prerequisites

Before running this application, ensure you have:

1. **Java 17+** installed.
2. **Apache Kafka & Zookeeper** installed and running.
3. **Maven** installed.

### Running Kafka & Zookeeper

Start **Zookeeper**:

```sh
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Start **Kafka Broker Service**:

```sh
bin/kafka-server-start.sh config/server.properties
```

Create **Topic** to store events:

```sh
bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
```

**Describe Topic** details:

```sh
bin/kafka-topics.sh --describe --topic quickstart-events --bootstrap-server localhost:9092
```

**WRITE** events into topic (Producing events):

```sh
bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
> This is my first event
> This is my second event
```

READ the events (consuming events):

```sh
bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
```

### Clone the Repository

```sh
git clone https://github.com/gagan-ujjini/kafka-project.git
cd kafka-project
```

### Run the Spring Boot Application

```sh
mvn spring-boot:run
```

## Conclusion

This project demonstrates a **real-time event-driven architecture** using **Apache Kafka**. It efficiently enables **location tracking** in a **cab booking system**.

---
