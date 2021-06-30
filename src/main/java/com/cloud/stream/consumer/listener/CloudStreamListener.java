package com.cloud.stream.consumer.listener;

import com.cloud.stream.model.CustomMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.stereotype.Component;

/**
 * The Cloud StreamListener Component
 */
@Slf4j
@Component
public class CloudStreamListener {

    /**
     * Stream Listener Definition with Sink INPUT Configuration
     * @param customMessage
     */
    @StreamListener(Sink.INPUT)
    public void listenMessage(CustomMessage customMessage) {
        log.info("Received Message: " + customMessage);
    }

}
