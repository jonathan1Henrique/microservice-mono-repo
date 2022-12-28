package com.projeto.consumidor.listeners;

import com.projeto.consumidor.custom.StrConsumerCustomListener;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class StrConsumerListener {

    @StrConsumerCustomListener(groupId = "group-1")
    public void create(String message) {
        log.info(" CREATE ::: Receive message {}", message);
    }

    @SneakyThrows
    @StrConsumerCustomListener(groupId = "group-1", containerFactory = "validMessageContainerFactory")
    public void log(String message) {
        log.info("LOG ::: Receive message {}", message);
        throw new Exception("Error ...");
    }

    @StrConsumerCustomListener(groupId = "group-2",
            topicPartitions = {
                    @TopicPartition(topic = "str-topic", partitions = {"1"}),
            }
    )
    public void history(String message) {
        log.info(" HISTORY ::: Receive message {}", message);
    }
}
