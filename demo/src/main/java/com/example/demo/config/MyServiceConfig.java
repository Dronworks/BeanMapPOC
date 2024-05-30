package com.example.demo.config;

import com.example.demo.annotation.ServiceNames;
import com.example.demo.services.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class MyServiceConfig {

    private final ApplicationContext applicationContext;

    public MyServiceConfig(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Bean
    @Primary
    public Map<String, MyService> serviceMap() {
        Map<String, MyService> serviceMap = new HashMap<>();
        Map<String, Object> beans = applicationContext.getBeansWithAnnotation(ServiceNames.class);

        for (Object bean : beans.values()) {
            MyService service = (MyService) bean;
            ServiceNames annotation = bean.getClass().getAnnotation(ServiceNames.class);
            for (String name : annotation.value()) {
                serviceMap.put(name, service);
            }
        }

        return serviceMap;
    }

}
