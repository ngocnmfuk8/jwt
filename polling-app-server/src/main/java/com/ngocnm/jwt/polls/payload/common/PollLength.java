package com.ngocnm.jwt.polls.payload.common;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

/**
 * @author NgocNM
 */
public class PollLength {
    @NotNull
    @Max(7)
    @Getter
    @Setter
    private Integer days;

    @NotNull
    @Max(23)
    @Getter
    @Setter
    private Integer hours;
}
