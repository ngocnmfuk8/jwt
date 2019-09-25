package com.ngocnm.jwt.polls.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author NgocNM
 */
public class ChoiceRequest {
    @NotBlank
    @Size(max = 40)
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
