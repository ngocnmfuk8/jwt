package com.ngocnm.jwt.polls.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author NgocNM
 */
public class ChoiceRequest {
    @NotBlank
    @Size(max = 40)
    @Getter
    @Setter
    private String text;
}
