package com.ngocnm.jwt.polls.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author NgocNM
 */
public class ChoiceVoteCount {
    @Getter
    @Setter
    private Long choiceId;
    @Getter
    @Setter
    private Long voteCount;

    public ChoiceVoteCount(Long choiceId, Long voteCount) {
        this.choiceId = choiceId;
        this.voteCount = voteCount;
    }
}

