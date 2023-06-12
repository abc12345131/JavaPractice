package com.example.demo.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

/**
 * @author abc12345131
 * @createdAt 6/6/2023-11:36 PM
 */
@Service
public class EventPublisher implements ApplicationEventPublisherAware {

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    ApplicationEventPublisher applicationEventPublisher;

    public void sendEvent(ApplicationEvent event) {

        applicationEventPublisher.publishEvent(event);
    }


}
