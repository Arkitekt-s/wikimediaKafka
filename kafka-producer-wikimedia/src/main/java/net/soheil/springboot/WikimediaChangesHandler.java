package net.soheil.springboot;

import com.launchdarkly.eventsource.EventHandler;
import com.launchdarkly.eventsource.MessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;

public class WikimediaChangesHandler implements EventHandler {
    private static final Logger logger = LoggerFactory.getLogger(WikimediaChangesHandler.class);
    private KafkaTemplate<String, String> kafkaTemplate;
    private String topic;

    public WikimediaChangesHandler(KafkaTemplate<String, String> kafkaTemplate, String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    @Override
    public void onOpen() throws Exception {
        // handle on open
    }

    @Override
    public void onClosed() throws Exception {
        // handle on closed
    }

    @Override
    public void onMessage(String event, MessageEvent messageEvent) throws Exception {
        logger.info("Producer Received message: " + messageEvent.getData());
        kafkaTemplate.send(topic, messageEvent.getData());
    }

    @Override
    public void onComment(String comment) throws Exception {
        // handle comment
    }

    @Override
    public void onError(Throwable t) {
        logger.error("Error in EventSource", t);
    }
}
