package com.example.demo.services.test2;

public sealed interface EventData permits UserEventData, AddressEventData {}
