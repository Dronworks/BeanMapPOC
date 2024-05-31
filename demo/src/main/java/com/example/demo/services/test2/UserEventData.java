package com.example.demo.services.test2;

public record UserEventData(String userId, String userName, String userEmail) implements EventData {}
