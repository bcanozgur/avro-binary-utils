package com.reddlyne.commons.serde.converter;

import org.springframework.http.MediaType;

public class AvroBinaryHttpMessageConverter<T> extends AvroHttpMessageConverter<T> {

    public AvroBinaryHttpMessageConverter() {
        super(true, new MediaType("application", "avro+binary", DEFAULT_CHARSET),
                new MediaType("application", "*+avro+binary", DEFAULT_CHARSET));
    }

}