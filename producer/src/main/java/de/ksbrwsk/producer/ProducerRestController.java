package de.ksbrwsk.producer;

import lombok.extern.log4j.Log4j2;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author saborowski
 */
@RestController
@Log4j2
public class ProducerRestController {

    private final JmsMessagingTemplate jmsMessagingTemplate;

    public ProducerRestController(JmsMessagingTemplate jmsMessagingTemplate) {
        this.jmsMessagingTemplate = jmsMessagingTemplate;
    }

    @GetMapping("/producer/{text}")
    public String send(@PathVariable String text) {
        String msg = "Hi, " + text;
        log.info("Sending Greeting Message - {}", msg);
        this.jmsMessagingTemplate.convertAndSend("Greeting", msg);
        return msg;
    }
}