package com.example.demo.controller;

import com.example.demo.event.EventPublisher;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abc12345131
 * @createdAt 6/6/2023-11:41 PM
 */
@RequiredArgsConstructor
@RestController
public class LoginController {

    @Autowired
    private final EventPublisher eventPublisher;

    @PostMapping("/login")
    public String login(String username, String password) {

        eventPublisher.sendEvent(username);

        return "login success";
    }

}
