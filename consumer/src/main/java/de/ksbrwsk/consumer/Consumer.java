package de.ksbrwsk.consumer;

import lombok.extern.log4j.Log4j2;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

/**
 * @author saborowski
 */
@Component
@Log4j2
public class Consumer {

    @JmsListener(destination = "Greeting", containerFactory = "jmsContainerFactory" )
    public void receiveMessage(Message message) {
        log.info(" received message: " + message.getPayload());
    }

}
