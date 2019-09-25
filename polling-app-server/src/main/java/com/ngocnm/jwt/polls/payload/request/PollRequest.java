package com.ngocnm.jwt.polls.payload.request;

import com.ngocnm.jwt.polls.payload.common.PollLength;
import lombok.Getter;
import lombok.Setter;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author NgocNM
 */
public class PollRequest {
    @NotBlank
    @Size(max = 140)
    @Getter
    @Setter
    private String question;

    @NotNull
    @Size(min = 2, max = 6)
    @Valid
    @Getter
    @Setter
    private List<ChoiceRequest> choices;

    @NotNull
    @Valid
    @Getter
    @Setter
    private PollLength pollLength;
}
