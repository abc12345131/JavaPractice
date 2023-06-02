package com.example.demo.config;

import com.example.demo.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author abc12345131
 * @createdAt 2023/5/31-0:26
 */

@EnableConfigurationProperties(User.class)
@Configuration
public class ComponentConfig {

    @ConditionalOnBean(name = "hello")
    @Bean
    public String hello2() {

        var user = new User();
        return "hello2";
    }

}
