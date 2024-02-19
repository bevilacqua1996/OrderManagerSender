# OrderManager Sender

Kafka sender to create new orders for Order Manager System.

## How to run

``mvn spring-boot:run``

**OBS**: Make sure to have your kafka cluster configured in port 9093. Otherwise, receiver endpoint will not work as it uses kafka to send the new order.

More information on how to configure your kafka cluster user docker-compose, you can check this cool article. [kafka-docker-for-local-development](https://hackernoon.com/setting-up-kafka-on-docker-for-local-development)