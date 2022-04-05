package com.reddlyne.commons.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RelationChange {

    private String sourceId;
    private String targetId;
    private Relation relation;
    private Boolean deleted;


    public enum Relation {
        MUTED,
        FOLLOWS,
        BLOCKED;
    }
}

