package com.example.demo.services.test5;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main4 {

    // Json string field to representing the Event1 oject
    private static final String EVENT1_JSON = "{\"retry\":1,\"name\":\"Event1\",\"surename\":\"Surename\"}";

    public static void main(String[] args) throws JsonProcessingException {
        // Create an Event1 object from the json string using objectmapper
        ObjectMapper objectMapper = new ObjectMapper();
        Event1 event1 = objectMapper.readValue(EVENT1_JSON, Event1.class);

        // Print the object
        System.out.println(event1);
    }

}
