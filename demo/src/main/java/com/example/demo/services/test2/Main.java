package com.example.demo.services.test2;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) {
        String userJson = "{ \"eventType\": \"UserSignup\", \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"userId\": \"12345\", \"userName\": \"john_doe\", \"userEmail\": \"john.doe@example.com\" } }";
        String addressJson = "{ \"eventType\": \"AddressUpdate\", \"timestamp\": \"2024-05-30T12:34:56Z\", \"data\": { \"addressId\": \"67890\", \"street\": \"123 Main St\", \"city\": \"Anytown\", \"state\": \"CA\", \"zipCode\": \"12345\" } }";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            Event userEvent = objectMapper.readValue(userJson, Event.class);
            Event addressEvent = objectMapper.readValue(addressJson, Event.class);

            System.out.println("User Event Data: " + userEvent.getData());
            System.out.println("Address Event Data: " + addressEvent.getData());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}