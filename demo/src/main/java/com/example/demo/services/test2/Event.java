package com.example.demo.services.test2;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

@Data
public class Event {

    private String eventType;
    private String timestamp;

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXTERNAL_PROPERTY, property = "eventType")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = UserEventData.class, name = "UserSignup"),
            @JsonSubTypes.Type(value = AddressEventData.class, name = "AddressUpdate")
    })
    private EventData data;


}
