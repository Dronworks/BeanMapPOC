package com.example.demo.services.test3;

import com.fasterxml.jackson.annotation.JsonTypeName;

//@JsonTypeName("AddressUpdate")
public record AddressEventData2(String eventType, String addressId, String street, String city, String state, String zipCode) implements EventData2 {}
