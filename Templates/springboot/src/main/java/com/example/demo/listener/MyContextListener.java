package com.example.demo.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author abc12345131
 * @createdAt 6/6/2023-10:49 PM
 */
public class MyContextListener implements ApplicationListener<ApplicationEvent> {
    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("=======" + event + "=======");
    }
}
