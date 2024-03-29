package bg.dr.chillywe.teamservice

import bg.dr.avro.chillywe.UserCreatedMessage
import org.apache.kafka.clients.consumer.ConsumerRecord
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.kafka.support.Acknowledgment
import org.springframework.stereotype.Component

@Component
class TeamServiceEventHandler {
    private val log = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["\${kafka.topic}"], groupId = "user-created-consumer-group")
    fun listenGroupFoo(userCreatedMessage: ConsumerRecord<String, UserCreatedMessage>, ack: Acknowledgment) {
        log.error("rtrdsgdfsgd")
        ack.acknowledge()
    }

}