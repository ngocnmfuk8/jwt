package com.ngocnm.jwt.polls.payload.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * @author NgocNM
 */
public class VoteRequest {
    @NotNull
    @Getter
    @Setter
    private Long choiceId;
}

