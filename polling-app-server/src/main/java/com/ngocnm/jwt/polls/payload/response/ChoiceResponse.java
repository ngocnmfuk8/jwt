package com.ngocnm.jwt.polls.payload.response;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NgocNM
 */
public class ChoiceResponse {
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String text;
    @Getter
    @Setter
    private long voteCount;
}
