package com.reddlyne.commons.serde.serialize;


import org.apache.commons.lang3.SerializationException;

public interface Serializer<T> {
    byte[] serialize(T data) throws SerializationException;
}
