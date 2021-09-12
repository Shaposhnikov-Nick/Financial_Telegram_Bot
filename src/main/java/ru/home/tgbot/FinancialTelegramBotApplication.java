package ru.home.tgbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class FinancialTelegramBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(FinancialTelegramBotApplication.class, args);
    }

}
