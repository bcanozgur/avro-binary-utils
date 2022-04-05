package com.reddlyne.commons.serde.serialize;

import com.reddlyne.commons.exception.SerializationException;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.io.Encoder;
import org.apache.avro.io.EncoderFactory;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.specific.SpecificRecordBase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class AvroSerializer<T extends SpecificRecordBase> implements Serializer<T> {

    private final boolean useBinaryEncoding;

    public AvroSerializer(boolean useBinaryEncoding) {
        this.useBinaryEncoding = useBinaryEncoding;
    }

    public boolean isUseBinaryEncoding() {
        return useBinaryEncoding;
    }

    @Override
    public byte[] serialize(T data) throws SerializationException {
        try {
            byte[] result = null;

            if (data != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                Encoder encoder = useBinaryEncoding ?
                        EncoderFactory.get().binaryEncoder(byteArrayOutputStream, null) :
                        EncoderFactory.get().jsonEncoder(data.getSchema(), byteArrayOutputStream);;

                DatumWriter<T> datumWriter = new SpecificDatumWriter<>(data.getSchema());
                datumWriter.write(data, encoder);

                encoder.flush();
                byteArrayOutputStream.close();

                result = byteArrayOutputStream.toByteArray();
            }
            return result;
        } catch (IOException e) {
            throw new SerializationException("Can't serialize data='" + data + "'", e);
        }
    }
}