package cn.uhfun.sox.magic.ex.serialize;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;

import java.io.IOException;

/**
 * @author fuhangbo
 * @see JsonDeserialize#using()
 */
public class JacksonStringToJavaObjectDeserializer extends JsonDeserializer<Object> implements ContextualDeserializer {
    private JavaType javaType;

    @Override
    public Object deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        ObjectMapper mapper = (ObjectMapper) p.getCodec();
        if (p.isExpectedStartObjectToken() || p.hasToken(JsonToken.FIELD_NAME)) {
            return p.readValueAs(javaType.getRawClass());
        }
        return mapper.readValue(p.getValueAsString(), javaType.getRawClass());
    }

    @Override
    public JsonDeserializer<?> createContextual(DeserializationContext ctxt, BeanProperty property) {
        javaType = property.getType();
        return this;
    }
}