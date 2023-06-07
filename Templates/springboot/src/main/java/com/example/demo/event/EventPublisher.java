package com.example.demo.event;

import org.springframework.stereotype.Service;

/**
 * @author abc12345131
 * @createdAt 6/6/2023-11:36 PM
 */
@Service
public class EventPublisher {
    public void sendEvent(String username) {
        System.out.println("send event: " + username);
    }
}
