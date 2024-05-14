# Spring Boot and Kafka with Zookeeper Project

## Overview

This project demonstrates the use of Spring Boot and Apache Kafka with Zookeeper to save data from Wikimedia to a MySQL database. It showcases the integration of these technologies to build a robust and scalable data processing pipeline.

## Technologies Used

- **Spring Boot**: A Java-based framework used to create standalone, production-grade Spring-based applications.
- **Apache Kafka**: A distributed event streaming platform capable of handling trillions of events a day.
- **Zookeeper**: A centralized service for maintaining configuration information, naming, providing distributed synchronization, and providing group services.
- **MySQL**: A relational database management system based on SQL – Structured Query Language.

## Project Structure

- **Producer**: Captures data from Wikimedia and sends it to Kafka.
- **Consumer**: Listens to Kafka topics and processes the data, then saves it to the MySQL database.

## Prerequisites

- Java 11 or higher
- Apache Kafka
- Zookeeper
- MySQL

## Setup and Running the Project

1. **Clone the Repository**

    ```bash
    git clone <repository-url>
    cd <repository-directory>
    ```

2. **Start Zookeeper**

    ```bash
    zookeeper-server-start.sh /usr/local/etc/kafka/zookeeper.properties
    ```

3. **Start Kafka**

    ```bash
    kafka-server-start.sh /usr/local/etc/kafka/server.properties
    ```

4. **Create Kafka Topic**

    ```bash
    kafka-topics.sh --create --topic wikimedia-topic --bootstrap-server localhost:9092
    ```

5. **Configure MySQL Database**

    - Ensure MySQL is installed and running.
    - Create a database named `wikimedia`.
    - Update the `application.properties` file with your MySQL database credentials.

6. **Build and Run the Spring Boot Application**

    ```bash
    ./mvnw spring-boot:run
    ```

## How It Works

1. **Data Producer**: The producer component fetches data from the Wikimedia API and sends it to a Kafka topic.
2. **Data Consumer**: The consumer component listens to the Kafka topic, processes the incoming data, and stores it in the MySQL database.

## Configuration

All configurations can be found and updated in the `application.properties` file located in the `src/main/resources` directory. Ensure to set your Kafka, Zookeeper, and MySQL configurations correctly.

## Contributing

Feel free to fork this repository and make contributions. Pull requests are always welcome.

## License

This project is licensed under the MIT License.

---

