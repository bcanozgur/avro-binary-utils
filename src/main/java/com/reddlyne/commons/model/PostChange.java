package com.reddlyne.commons.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class PostChange {
    private String userID;
    private String postID;
    private LocalDateTime postedAt;
    private Operation operation;
    private List<String> hashtag;
    private String content;
    private boolean hasImage;
    private boolean hasVideo;
    private double lat;
    private double lon;
    private String category;

    public enum Operation {
        CREATE, UPDATE, DELETE;
    }

}
