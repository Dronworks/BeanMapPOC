package com.example.demo.services.test3;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main2 {
    public static void main(String[] args) {
        String userJson = "{ \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"eventType\": \"UserSignup\", \"userId\": \"12345\", \"userName\": \"john_doe\", \"userEmail\": \"john.doe@example.com\" } }";
        String userJson2 = "{ \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"eventType\": \"UserSignup2\", \"userId\": \"12345\", \"userName\": \"john_doe\", \"userEmail\": \"john.doe@example.com\" } }";
        String addressJson = "{ \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"eventType\": \"AddressUpdate\", \"addressId\": \"67890\", \"street\": \"123 Main St\", \"city\": \"Anytown\", \"state\": \"CA\", \"zipCode\": \"12345\" } }";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Event2 userEvent = objectMapper.readValue(userJson, Event2.class);
            Event2 userEvent2 = objectMapper.readValue(userJson2, Event2.class);
            Event2 addressEvent = objectMapper.readValue(addressJson, Event2.class);

            System.out.println("User Event Data: " + userEvent.data());
            System.out.println("User Event Data 2: " + userEvent2.data());
            System.out.println("Address Event Data: " + addressEvent.data());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}