package me.k11i.example.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
@ConfigurationProperties("example-app.java")
public class JavaExample implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(JavaExample.class);

    /** A message to log. */
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("message = {}", message);
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaExample.class, args);
    }
}
