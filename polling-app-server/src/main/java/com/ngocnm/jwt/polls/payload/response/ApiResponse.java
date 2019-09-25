package com.ngocnm.jwt.polls.payload.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author NgocNM
 */
@AllArgsConstructor
public class ApiResponse {
    @Getter
    @Setter
    private Boolean success;
    @Getter
    @Setter
    private String message;
}
