package com.reddlyne.commons.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class HomeTimelineRelatedTopic {

    private String timelineUserID;
    private RelationChange relationChange;
    private PostChange fanoutPostChange;
    private UserChange userChange;
}
