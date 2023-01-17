package cn.uhfun.sox.magic.ex.serialize;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;

import java.lang.reflect.Type;

import static com.alibaba.fastjson.parser.JSONToken.LITERAL_STRING;

/**
 * @author fuhangbo
 * @see JSONField#deserializeUsing()
 */
public class FastJsonStringToJavaObjectDeserializer implements ObjectDeserializer {
    @Override
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
        final JSONLexer lexer = parser.lexer;
        if (lexer.token() == JSONToken.LITERAL_STRING) {
            String val = lexer.stringVal();
            lexer.nextToken(JSONToken.COMMA);
            return JSON.parseObject(val, type);
        }
        return parser.parseObject(type, fieldName);
    }

    @Override
    public int getFastMatchToken() {
        return LITERAL_STRING;
    }
}
