package com.example.demo.services.test4;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main3 {
    public static void main(String[] args) {
        String userJson = "{ \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"eventType\": \"UserSignup\", \"retryAmount\": 3, \"userId\": \"12345\", \"userName\": \"john_doe\", \"userEmail\": \"john.doe@example.com\" } }";
        String addressJson = "{ \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"eventType\": \"AddressUpdate\", \"retryAmount\": 3, \"addressId\": \"67890\", \"street\": \"123 Main St\", \"city\": \"Anytown\", \"state\": \"CA\", \"zipCode\": \"12345\" } }";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Event3 userEvent = objectMapper.readValue(userJson, Event3.class);
            Event3 addressEvent = objectMapper.readValue(addressJson, Event3.class);

            System.out.println("User Event Data: " + userEvent.data());
            System.out.println("User Event Data 2: " + userEvent.data().getEventType() + " " + userEvent.data().getRetryAmount());
            System.out.println("Address Event Data: " + addressEvent.data());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}