package com.ngocnm.jwt.polls.payload.request;

import javax.validation.constraints.NotNull;

/**
 * @author NgocNM
 */
public class VoteRequest {
    @NotNull
    private Long choiceId;

    public Long getChoiceId() {
        return choiceId;
    }

    public void setChoiceId(Long choiceId) {
        this.choiceId = choiceId;
    }
}

