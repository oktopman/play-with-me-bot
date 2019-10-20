package com.oktop.bot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class BotApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BotApplication.class)
                .properties("spring.config.location=classpath:application.yml," +
                        "classpath:/private-config/bot-private.yml")
                .run(args);
    }

}
