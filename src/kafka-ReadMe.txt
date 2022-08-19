

-- Zookeeper & kafka server start

$KAFKA ./bin/zookeeper-server-start.sh ./config/zookeeper.properties
$KAFKA ./bin/kafka-server-start.sh ./config/server.properties


-- Create Topic

$KAFKA ./bin//kafka-topics.sh --bootstrap-server localhost:9092 --create --topic quickstart-events --partitions 1

-- Topic List

$KAFKA_HOME ./bin/kafka-topic.sh --bootstrap-server localhost:9092 --list

-- Topic info

$KAFKA_HOME ./bin/kafka-topic.sh --describe --topic quickstart-events --bootstrap-server localhost:9092

-- Run kafka Producer
./kafka-console-producer.sh --broker-list localhost:9092 --topic name

-- Run kafka Consumer
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic name --from begging

-- Run Kafka Connect
$Kafka Connect ./bin/connect-distributed ./etc/kafka/connect-distributed.properties


