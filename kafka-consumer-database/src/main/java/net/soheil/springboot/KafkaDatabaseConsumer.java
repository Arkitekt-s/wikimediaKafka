package net.soheil.springboot;

import net.soheil.springboot.entity.WikimediaData;
import net.soheil.springboot.repository.WikimediaRepository;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service

public class KafkaDatabaseConsumer {
    private static final Logger logger = Logger.getLogger(KafkaDatabaseConsumer.class.getName());
    private WikimediaRepository wikimediaRepository;

    public KafkaDatabaseConsumer(WikimediaRepository wikimediaRepository) {
        this.wikimediaRepository = wikimediaRepository;
    }

    @KafkaListener(topics = "wikimedia", groupId = "soheilGroup")

    public void consume(String eventMessage) {
        logger.info(String.format("Consumed message received -> %s", eventMessage));
        WikimediaData wikimediaData = new WikimediaData();
        wikimediaData.setWikiEventData(eventMessage);
        wikimediaRepository.save(wikimediaData);
    }
}
