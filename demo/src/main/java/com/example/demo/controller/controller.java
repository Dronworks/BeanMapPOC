package com.example.demo.controller;

import com.example.demo.services.MyComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    private MyComponent myComponent;

    @PostMapping("/test")
    public void runTest() {
        myComponent.executeAction("Alias1");
        myComponent.executeAction("Alias2");
        myComponent.executeAction("Alias3");
        myComponent.executeAction("UNK");
    }

}
