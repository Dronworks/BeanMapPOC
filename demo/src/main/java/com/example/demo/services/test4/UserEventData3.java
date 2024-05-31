package com.example.demo.services.test4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class UserEventData3 extends EventData3 {
    private String userId;
    private String userName;
    private String userEmail;

    // tostring with EventData3 fields
    @Override
    public String toString() {
        return "UserEventData3{" +
                "eventType='" + getEventType() + '\'' +
                ", timestamp='" + getTimestamp() + '\'' +
                ", retryAmount=" + getRetryAmount() +
                ", userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}

