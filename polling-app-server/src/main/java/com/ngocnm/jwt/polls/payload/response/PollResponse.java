package com.ngocnm.jwt.polls.payload.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.ngocnm.jwt.polls.payload.common.UserSummary;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;
import java.util.List;

/**
 * @author NgocNM
 */
public class PollResponse {
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String question;
    @Getter
    @Setter
    private List<ChoiceResponse> choices;
    @Getter
    @Setter
    private UserSummary createdBy;
    @Getter
    @Setter
    private Instant creationDateTime;
    @Getter
    @Setter
    private Instant expirationDateTime;
    @Getter
    @Setter
    private Boolean isExpired;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @Setter
    private Long selectedChoice;
    @Getter
    @Setter
    private Long totalVotes;
}
