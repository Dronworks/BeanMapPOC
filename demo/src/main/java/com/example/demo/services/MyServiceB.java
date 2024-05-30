package com.example.demo.services;

import com.example.demo.annotation.ServiceNames;
import org.springframework.stereotype.Service;

@Service
@ServiceNames({"b"})
public class MyServiceB implements MyService {

    @Override
    public void performAction() {
        System.out.println("Action B performed");
    }

}
