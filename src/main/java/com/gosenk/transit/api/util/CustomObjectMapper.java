package com.gosenk.transit.api.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Primary
public class CustomObjectMapper extends ObjectMapper{

    public CustomObjectMapper(){
        configure(SerializationFeature.WRITE_NULL_MAP_VALUES, false);
        configure(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS, true);
        setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
        getSerializerProvider().setNullKeySerializer(new NullKeySerializer());
    }

    private class NullKeySerializer extends JsonSerializer<Object> {
        @Override
        public void serialize(Object nullKey, JsonGenerator jsonGenerator, SerializerProvider unused)
                throws IOException, JsonProcessingException
        {
            jsonGenerator.writeFieldName("");
        }
    }
}
