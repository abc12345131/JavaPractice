package com.example.demo.config;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

/**
 * @author abc12345131
 * @createdAt 2023/5/31-0:22
 */


@SpringBootConfiguration
public class AppConfig {

    @Bean
    public String hello() {
        return "hello";
    }
}
