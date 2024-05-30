package com.example.demo.services;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.context.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class ApplicationStartUp implements ApplicationListener<ApplicationReadyEvent> {

    @Autowired
    private ApplicationContext applicationContext;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        /*String[] beanNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Loading beans:");
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
    }
}