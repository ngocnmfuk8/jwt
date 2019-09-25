package com.ngocnm.jwt.polls.payload.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NgocNM
 */
public class JwtAuthenticationResponse {
    @Getter
    @Setter
    private String accessToken;
    @Getter
    @Setter
    private String tokenType = "Bearer";

    public JwtAuthenticationResponse(String accessToken) {
        this.accessToken = accessToken;
    }
}
