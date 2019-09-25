package com.ngocnm.jwt.polls.payload.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NgocNM
 */
public class UserIdentityAvailability {
    @Getter
    @Setter
    private Boolean available;

    public UserIdentityAvailability(Boolean available) {
        this.available = available;
    }
}
