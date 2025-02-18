# kafka-project

## Benefits of using Kafka
- High throughput: Efficiently handle large volumes of real-time data streams. 
- Scalability: Add more brokers to the cluster as data volume increases. 
- Fault tolerance: Data replication across multiple brokers ensures availability even if one server fails. 

## Kafka Architecture
- Kafka is primarily based on the publisher-subscriber(pub-sub) architecture where producers publish messages to "topics" and consumers subscribe to those topics to receive messages
- KAFKA CLUSTER: A group of interconnected servers (called brokers) that work together to store and manage large streams of data
- Brokers: Individual servers that store and distribute data within the cluster. 
- Topics: Logical categories for data, where messages with a similar theme are grouped. 
- Partitions: Subdivisions within a topic that allow for parallel processing and better scalability. 
- ZOOKEEPER: It is essentially a central coordinator that keeps track of the status of all the brokers (servers) in the Kafka cluster
