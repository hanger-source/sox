package cn.uhfun.sox.magic.reflection;

import org.junit.Test;
import org.springframework.scheduling.annotation.Scheduled;

import static java.util.Collections.singletonMap;

public class AnnotationsTest {

    @Test
    public void annotationForMap() {
        // 使用属性map 构建注解实例
        Scheduled scheduled = Annotations.annotationForMap(Scheduled.class, singletonMap("cron", "0 * * * * MON-FRI"));
    }
}