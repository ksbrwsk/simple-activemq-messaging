package de.ksbrwsk.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

import java.io.IOException;

@SpringBootApplication
@EnableJms
public class ProducerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(ProducerApplication.class, args);
    }
}
