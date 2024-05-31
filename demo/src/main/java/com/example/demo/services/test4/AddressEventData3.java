package com.example.demo.services.test4;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@JsonTypeName("AddressUpdate")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AddressEventData3 extends EventData3 {
    private String addressId;
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public AddressEventData3(String eventType, String timestamp, int retryAmount, String addressId, String street, String city, String state, String zipCode) {
        super(eventType, timestamp, retryAmount);
        this.addressId = addressId;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // to string with EventData3 fields
    @Override
    public String toString() {
        return "AddressEventData3{" +
                "eventType='" + getEventType() + '\'' +
                ", timestamp='" + getTimestamp() + '\'' +
                ", retryAmount=" + getRetryAmount() +
                ", addressId='" + addressId + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

}

