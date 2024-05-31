package com.example.demo.services.test2;

public record AddressEventData(String addressId, String street, String city, String state, String zipCode) implements EventData {}
