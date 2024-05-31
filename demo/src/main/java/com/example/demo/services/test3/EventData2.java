package com.example.demo.services.test3;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "eventType", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = UserEventData2.class, name = "UserSignup"),
        @JsonSubTypes.Type(value = UserEventData2.class, name = "UserSignup2"),
        @JsonSubTypes.Type(value = AddressEventData2.class, name = "AddressUpdate")
})
public sealed interface EventData2 permits UserEventData2, AddressEventData2 {}