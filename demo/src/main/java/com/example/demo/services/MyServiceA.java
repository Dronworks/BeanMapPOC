package com.example.demo.services;

import com.example.demo.annotation.ServiceNames;
import org.springframework.stereotype.Service;

@Service
@ServiceNames({"a", "an"})
public class MyServiceA implements MyService {

    @Override
    public void performAction() {
        System.out.println("Action A performed");
    }

}
