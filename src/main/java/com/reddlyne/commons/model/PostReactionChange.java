package com.reddlyne.commons.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostReactionChange {

    private String postID;
    private long likeCount;
    private long dislikeCount;
    private long retweetCount;
    private long commentCount;
}
