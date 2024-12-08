package com.study.learnKafka.event;

import lombok.Data;

@Data
public class UserCreatedEvent {
    private Long id;
    private String fullName;
    private String email;
}
