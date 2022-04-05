package com.reddlyne.commons.serde.converter;

import org.springframework.http.MediaType;

public class AvroJsonHttpMessageConverter<T> extends AvroHttpMessageConverter<T> {

    public AvroJsonHttpMessageConverter() {
        super(true, new MediaType("application", "avro+json", DEFAULT_CHARSET),
                new MediaType("application", "*+avro+json", DEFAULT_CHARSET));
    }

}
