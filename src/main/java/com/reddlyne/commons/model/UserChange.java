package com.reddlyne.commons.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserChange {
    private String userID;
    private String userName;
    private String fullName;
    private boolean isVerified;
    private Operation operation;
    private LocalDateTime updateAt;

    public enum Operation {
        CREATE, UPDATE, DELETE, FREEZE, UNFREEZE;
    }
}
