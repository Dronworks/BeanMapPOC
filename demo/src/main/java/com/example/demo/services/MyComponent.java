package com.example.demo.services;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    private final MyServiceSelector myServiceSelector;

    @Autowired
    public MyComponent(MyServiceSelector myServiceSelector) {
        this.myServiceSelector = myServiceSelector;
    }

    public void executeAction(String serviceName) {
        MyService service = myServiceSelector.getService(serviceName);
        if(service != null) {
            service.performAction();
        } else {
            System.out.println("No service found: " + serviceName);
        }
    }

}
