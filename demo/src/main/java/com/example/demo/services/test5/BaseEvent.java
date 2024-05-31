package com.example.demo.services.test5;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEvent {

    @JsonProperty("retry")
    protected int retry;
    @JsonProperty("name")
    protected String name;

}
