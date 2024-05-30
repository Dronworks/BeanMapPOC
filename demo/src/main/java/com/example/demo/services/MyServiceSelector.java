package com.example.demo.services;

import com.example.demo.annotation.ServiceNames;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MyServiceSelector {

    private final Map<String, MyService> services;

    @Autowired
    public MyServiceSelector(Map<String, MyService> services, ApplicationContext applicationContext) {
        this.services = services;
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(ServiceNames.class);

        for (Object bean : beans.values()) {
            MyService service = (MyService) bean;
            ServiceNames annotation = bean.getClass().getAnnotation(ServiceNames.class);
            for (String name : annotation.value()) {
                services.put(name, service);
            }
        }
    }

    public MyService getService(String service) {
        return services.get(service);
    }

}
