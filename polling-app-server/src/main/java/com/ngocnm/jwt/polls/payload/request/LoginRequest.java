package com.ngocnm.jwt.polls.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

/**
 * @author NgocNM
 */
public class LoginRequest {
    @NotBlank
    @Getter
    @Setter
    private String usernameOrEmail;

    @NotBlank
    @Getter
    @Setter
    private String password;
}
