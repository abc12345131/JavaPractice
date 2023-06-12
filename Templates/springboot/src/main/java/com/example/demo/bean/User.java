package com.example.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author abc12345131
 * @createdAt 2023/5/31-0:42
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@ConfigurationProperties(prefix = "user")
public class User {

    private String id;
    private String username;
    private String password;
    private String email;
}
