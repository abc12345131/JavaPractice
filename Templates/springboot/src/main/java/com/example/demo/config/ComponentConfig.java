package com.example.demo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @author abc12345131
 * @createdAt 2023/5/31-0:26
 */
@Configuration
public class ComponentConfig {

    @Bean
    public Class hello() {
        return ComponentConfig.class;
    }
    
    @ConditionalOnBean(name = "hello")
    @Bean
    public String hello2() {
        return "hello2";
    }

}
