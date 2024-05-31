package com.example.demo.services.test3;

import com.fasterxml.jackson.annotation.JsonTypeName;

//@JsonTypeName("UserSignup")
public record UserEventData2(String eventType, String userId, String userName, String userEmail) implements EventData2 {}
