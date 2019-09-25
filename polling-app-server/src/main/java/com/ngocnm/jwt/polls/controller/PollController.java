package com.ngocnm.jwt.polls.controller;

import com.ngocnm.jwt.polls.model.Poll;
import com.ngocnm.jwt.polls.payload.common.PagedResponse;
import com.ngocnm.jwt.polls.payload.request.PollRequest;
import com.ngocnm.jwt.polls.payload.request.VoteRequest;
import com.ngocnm.jwt.polls.payload.response.ApiResponse;
import com.ngocnm.jwt.polls.payload.response.PollResponse;
import com.ngocnm.jwt.polls.security.CurrentUser;
import com.ngocnm.jwt.polls.security.UserPrincipal;
import com.ngocnm.jwt.polls.service.PollService;
import com.ngocnm.jwt.polls.util.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

/**
 * @author NgocNM
 */
@RestController
@RequestMapping("/api/polls")
public class PollController {
    @Autowired
    private PollService pollService;

    private static final Logger logger = LoggerFactory.getLogger(PollController.class);

    @GetMapping
    public PagedResponse<PollResponse> getPolls(@CurrentUser UserPrincipal currentUser,
                                                @RequestParam(value = "page", defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) int page,
                                                @RequestParam(value = "size", defaultValue = AppConstants.DEFAULT_PAGE_SIZE) int size) {
        return pollService.getAllPolls(currentUser, page, size);
    }

    @PostMapping
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> createPoll(@Valid @RequestBody PollRequest pollRequest) {
        Poll poll = pollService.createPoll(pollRequest);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{pollId}")
                .buildAndExpand(poll.getId()).toUri();

        return ResponseEntity.created(location)
                .body(new ApiResponse(HttpStatus.OK, "Poll Created Successfully", poll));
    }


    @GetMapping("/{pollId}")
    public ResponseEntity<?> getPollById(@CurrentUser UserPrincipal currentUser,
                                    @PathVariable Long pollId) {
        PollResponse poll = pollService.getPollById(pollId, currentUser);
        return ResponseEntity.ok(new ApiResponse(HttpStatus.OK, poll));
    }

    @PostMapping("/{pollId}/votes")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> castVote(@CurrentUser UserPrincipal currentUser,
                                 @PathVariable Long pollId,
                                 @Valid @RequestBody VoteRequest voteRequest) {
        PollResponse poll = pollService.castVoteAndGetUpdatedPoll(pollId, voteRequest, currentUser);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{pollId}/votes")
                .buildAndExpand(poll.getId()).toUri();

        return ResponseEntity.created(location).body(new ApiResponse(HttpStatus.OK, "cast vote successfully", poll));
    }
}
