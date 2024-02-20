# OrderManager Sender

Kafka sender to create new orders for Order Manager System.

## Description

This microservice works integrated with [Order Manager](https://github.com/bevilacqua1996/OrderManager).
Basically, this is microservice which implements the Kafka Producer which is going to publish messages in specific topic (external-orders).
On the other side (Order Manager project) we have a Kafka Consumer implemented in order to pull the messages published by the producer and create this new orders.

## How to run

``mvn spring-boot:run``

**OBS**: Make sure to have your kafka cluster configured in port 9093. Otherwise, receiver endpoint will not work as it uses kafka to send the new order.

More information on how to configure your kafka cluster user docker-compose, you can check this cool article. [kafka-docker-for-local-development](https://hackernoon.com/setting-up-kafka-on-docker-for-local-development)