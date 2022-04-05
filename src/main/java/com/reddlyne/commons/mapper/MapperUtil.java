package com.reddlyne.commons.mapper;

import com.reddlyne.commons.model.*;
import com.reddlyne.commons.model.avro.*;

public class MapperUtil {

    public static HomeTimelineRelatedTopic homeTimelineAvroToPojo(TimelineHomeRelatedAvro avro) {
        return HomeTimelineRelatedTopic.builder()
                .timelineUserID(avro.getTimelineUserID())
                .relationChange(avro.getRelationChange() == null ? null : relationChangeAvroToPojo(avro.getRelationChange()))
                .fanoutPostChange(avro.getFanoutPostChange() == null ? null : postChangeAvroToPojo(avro.getFanoutPostChange()))
                .userChange(avro.getUserChangeAvro() == null ? null : userChangeAvroToPojo(avro.getUserChangeAvro()))
                .build();
    }

    public static HomeTimelineRelatedTopic relationChangeAvroToHomeTimelinePojo(RelationChangeAvro rel) {
        return HomeTimelineRelatedTopic.builder()
                .timelineUserID(rel.getSourceId())
                .relationChange(relationChangeAvroToPojo(rel))
                .build();
    }

    public static TimelineHomeRelatedAvro relationChangeAvroToHomeTimelineAvro(RelationChangeAvro rel) {
        return TimelineHomeRelatedAvro.newBuilder()
                .setTimelineUserID(rel.getSourceId())
                .setRelationChange(rel)
                .build();
    }

    public static TimelineHomeRelatedAvro userChangeAvroToHomeTimelineAvro(UserChangeAvro userChangeAvro) {
        return TimelineHomeRelatedAvro.newBuilder()
                .setTimelineUserID(userChangeAvro.getUserID())
                .setUserChangeAvro(userChangeAvro)
                .build();
    }

    public static PostChange postChangeAvroToPojo(PostChangeAvro avro) {
        return PostChange.builder()
                .postID(avro.getPostID())
                .userID(avro.getUserID())
                .postedAt(avro.getPostedAt())
                .operation(operationAvroToPojo(avro.getOperation()))
                .hashtag(avro.getHashtag())
                .content(avro.getContent())
                .hasImage(avro.getHasImage())
                .hasVideo(avro.getHasVideo())
                .lat(avro.getLat())
                .lon(avro.getLon())
                .category(avro.getCategory())
                .build();
    }

    public static PostChangeAvro postChangePojoToAvro(PostChange postChange) {
        return PostChangeAvro.newBuilder()
                .setPostID(postChange.getPostID())
                .setUserID(postChange.getUserID())
                .setPostedAt(postChange.getPostedAt())
                .setOperation(operationPojoToAvro(postChange.getOperation()))
                .setHashtag(postChange.getHashtag())
                .setContent(postChange.getContent())
                .setHasImage(postChange.isHasImage())
                .setHasVideo(postChange.isHasVideo())
                .setLat(postChange.getLat())
                .setLon(postChange.getLon())
                .setCategory(postChange.getCategory())
                .build();
    }

    public static UserChangeAvro userChangePojoToAvro(UserChange userChange){
        return UserChangeAvro.newBuilder()
                .setUserID(userChange.getUserID())
                .setOperation(userOperationPojoToAvro(userChange.getOperation()))
                .build();
    }


    public static PostReactionChange postReactionChangeAvroToPojo(PostReactionChangeAvro avro) {
        return PostReactionChange.builder()
                .postID(avro.getPostID())
                .likeCount(avro.getLikeCount())
                .dislikeCount(avro.getDislikeCount())
                .retweetCount(avro.getRetweetCount())
                .commentCount(avro.getCommentCount())
                .build();
    }

    public static RelationChange relationChangeAvroToPojo(RelationChangeAvro avro) {
        return RelationChange.builder()
                .sourceId(avro.getSourceId())
                .targetId(avro.getTargetId())
                .relation(relationAvroToPojo(avro.getRelation()))
                .deleted(avro.getDeleted())
                .build();
    }

    public static UserChange userChangeAvroToPojo(UserChangeAvro userChangeAvro) {
        return UserChange.builder()
                .userID(userChangeAvro.getUserID())
                .userName(userChangeAvro.getUserName())
                .fullName(userChangeAvro.getFullName())
                .isVerified(userChangeAvro.getIsVerified())
                .operation(userOperationAvroToPojo(userChangeAvro.getOperation()))
                .updateAt(userChangeAvro.getUpdateAt())
                .build();
    }

    private static RelationChange.Relation relationAvroToPojo(RelationAvro relationAvro) {
        switch (relationAvro) {
            case MUTED:
                return RelationChange.Relation.MUTED;
            case BLOCKED:
                return RelationChange.Relation.BLOCKED;
            case FOLLOWS:
            default:
                return RelationChange.Relation.FOLLOWS;
        }
    }

    private static PostChange.Operation operationAvroToPojo(OperationAvro operationAvro) {
        switch (operationAvro) {
            case DELETE:
                return PostChange.Operation.DELETE;
            case UPDATE:
                return PostChange.Operation.UPDATE;
            case CREATE:
            default:
                return PostChange.Operation.CREATE;
        }
    }

    private static OperationAvro operationPojoToAvro(PostChange.Operation operation) {
        switch (operation) {
            case DELETE:
                return OperationAvro.DELETE;
            case UPDATE:
                return OperationAvro.UPDATE;
            case CREATE:
            default:
                return OperationAvro.CREATE;
        }
    }

    private static UserChange.Operation userOperationAvroToPojo(UserOperationAvro operationAvro) {
        switch (operationAvro) {
            case DELETE:
                return UserChange.Operation.DELETE;
            case UPDATE:
                return UserChange.Operation.UPDATE;
            case FREEZE:
                return UserChange.Operation.FREEZE;
            case UNFREEZE:
                return UserChange.Operation.UNFREEZE;
            case CREATE:
            default:
                return UserChange.Operation.CREATE;
        }
    }

    private static UserOperationAvro userOperationPojoToAvro(UserChange.Operation operation) {
        switch (operation) {
            case DELETE:
                return UserOperationAvro.DELETE;
            case UPDATE:
                return UserOperationAvro.UPDATE;
            case FREEZE:
                return UserOperationAvro.FREEZE;
            case UNFREEZE:
                return UserOperationAvro.UNFREEZE;
            case CREATE:
            default:
                return UserOperationAvro.CREATE;
        }
    }
}
