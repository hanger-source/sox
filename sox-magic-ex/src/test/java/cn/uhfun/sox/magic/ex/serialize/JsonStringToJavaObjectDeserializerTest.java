package cn.uhfun.sox.magic.ex.serialize;

import cn.uhfun.sox.magic.ex.serialize.Commons.TestModel;
import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static cn.uhfun.sox.magic.ex.serialize.Commons.normalJsonString;
import static cn.uhfun.sox.magic.ex.serialize.Commons.weirdJsonString;

public class JsonStringToJavaObjectDeserializerTest {

    @Test
    public void fastJsonDeserialize() {
        // 常规传值
        JSON.parseObject(normalJsonString, TestModel.class);
        // Json字符串传值
        JSON.parseObject(weirdJsonString, TestModel.class);
    }

    @Test
    public void jacksonDeserialize() throws JsonProcessingException {
        // 常规传值
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.readValue(normalJsonString, TestModel.class);
        // Json字符串传值
        objectMapper.readValue(weirdJsonString, TestModel.class);
    }
}