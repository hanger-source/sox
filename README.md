### 反射

#### 使用属性map 构建注解实例

- cn.uhfun.sox.magic.base.reflection.Annotations.annotationForMap

> `sun.reflect.annotation.AnnotationParser.annotationForMap`

### 序列化

#### 兼容接收值为Json字符串的对象类型字段

常规传值

```json
{
  "innerTest": {
    "test": "我是InnerTest.test"
  }
}
```

Json字符串传值

```json
{
  "innerTest": "{ \"test\": \"我是InnerTest.test\"}"
}
```

- cn.uhfun.sox.magic.ex.serialize.FastJsonStringToJavaObjectDeserializer

> com.alibaba.fastjson.parser.deserializer.ObjectDeserializer

- cn.uhfun.sox.magic.ex.serialize.JacksonStringToJavaObjectDeserializer

> com.fasterxml.jackson.databind.JsonDeserializer

