package com.example.demo.services.test4;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "EventType1", visible = true)
@JsonSubTypes({
        @JsonSubTypes.Type(value = UserEventData3.class, name = "UserSignup"),
        @JsonSubTypes.Type(value = AddressEventData3.class, name = "AddressUpdate")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@JsonDeserialize
public class EventData3 {
    @JsonProperty("EventType1")
    private String eventType;
    private String timestamp;
    private int retryAmount;
}