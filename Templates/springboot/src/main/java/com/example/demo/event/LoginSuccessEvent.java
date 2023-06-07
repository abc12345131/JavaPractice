package com.example.demo.event;

import com.example.demo.bean.User;
import org.springframework.context.ApplicationEvent;

/**
 * @author abc12345131
 * @createdAt 6/6/2023-11:38 PM
 */
public class LoginSuccessEvent extends ApplicationEvent {
    public LoginSuccessEvent(User source) {
        super(source);
    }
}
