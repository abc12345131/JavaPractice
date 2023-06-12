package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;

/**
 * @author abc12345131
 * @createdAt 6/7/2023-12:21 AM
 */
public class AccountService {

    public void addCheckInScore(String username) {
        System.out.println(username+", score + 1");
    }

    @EventListener
    public void onApplicationEvent(LoginSuccessEvent event) {
        User source = (User) event.getSource();
        addCheckInScore(source.getUsername());
        System.out.println("event = " + event);
    }
}
