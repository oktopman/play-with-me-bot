package com.oktop.bot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BotApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BotApplication.class, args);
        new SpringApplicationBuilder(BotApplication.class)
                .properties("spring.config.location=classpath*:/bot-private.yml")
                .run(args);
    }

}
