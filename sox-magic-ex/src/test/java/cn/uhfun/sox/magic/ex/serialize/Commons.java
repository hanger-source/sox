package cn.uhfun.sox.magic.ex.serialize;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

public class Commons {

    public static final String normalJsonString = "{\"innerTest\": {\"test\": \"我是InnerTest.test\"} }";
    public static final String weirdJsonString = "{\"innerTest\": \"{ \\\"test\\\": \\\"我是InnerTest.test\\\"}\"}";

    @Data
    public static class TestModel {
        @JSONField(deserializeUsing = FastJsonStringToJavaObjectDeserializer.class)
        @JsonDeserialize(using = JacksonStringToJavaObjectDeserializer.class)
        private InnerTestModel innerTest;
    }

    @Data
    public static class InnerTestModel {
        private String test;
    }
}
