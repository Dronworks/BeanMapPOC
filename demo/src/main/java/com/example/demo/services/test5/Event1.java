package com.example.demo.services.test5;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Event1 extends BaseEvent{

    private String surename;

    @Override
    public String toString() {
        return "Event1{" +
                "retry=" + getRetry() +
                ", name='" + getName() + '\'' +
                ", surename='" + surename + '\'' +
                '}';
    }

}
