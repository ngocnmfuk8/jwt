package com.ngocnm.jwt.polls.payload.common;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author NgocNM
 */
@NoArgsConstructor
public class PagedResponse<T> {

    @Getter
    @Setter
    private List<T> content;
    @Getter
    @Setter
    private int page;
    @Getter
    @Setter
    private int size;
    @Getter
    @Setter
    private long totalElements;
    @Getter
    @Setter
    private int totalPages;
    @Getter
    @Setter
    private boolean last;

    public PagedResponse(List<T> content, int page, int size, long totalElements, int totalPages, boolean last) {
        this.content = content;
        this.page = page;
        this.size = size;
        this.totalElements = totalElements;
        this.totalPages = totalPages;
        this.last = last;
    }
}
