package com.ngocnm.jwt.polls.payload.common;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NgocNM
 */
public class UserSummary {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String name;

    public UserSummary(Long id, String username, String name) {
        this.id = id;
        this.username = username;
        this.name = name;
    }
}
