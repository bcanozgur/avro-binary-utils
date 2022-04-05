package com.reddlyne.commons.serde.deserialize;


import com.reddlyne.commons.exception.SerializationException;

public interface Deserializer<T> {
    T deserialize(Class<? extends T> clazz, byte[] data) throws SerializationException;
}
