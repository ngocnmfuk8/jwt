package com.ngocnm.jwt.polls.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * @author NgocNM
 */
public class ApiResponse <T>{
    @Getter
    @Setter
    private int code;
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;
    @Getter
    @Setter
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T content;

    public ApiResponse(HttpStatus code, String message) {
        this.code = code.value();
        this.message = message;
    }

    public ApiResponse(HttpStatus code, String message, T content) {
        this.code = code.value();
        this.message = message;
        this.content = content;
    }

    public ApiResponse(HttpStatus code, T content) {
        this.code = code.value();
        this.content = content;
    }
}
