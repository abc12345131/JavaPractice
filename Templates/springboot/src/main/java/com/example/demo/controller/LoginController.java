package com.example.demo.controller;

import com.example.demo.bean.User;
import com.example.demo.event.EventPublisher;
import com.example.demo.event.LoginSuccessEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author abc12345131
 * @createdAt 6/6/2023-11:41 PM
 */
@RequiredArgsConstructor
@RestController
public class LoginController {

    private final EventPublisher eventPublisher;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password) {

        LoginSuccessEvent loginSuccessEvent = new LoginSuccessEvent(new User());

        eventPublisher.sendEvent(loginSuccessEvent);

        return "login success";
    }

}
