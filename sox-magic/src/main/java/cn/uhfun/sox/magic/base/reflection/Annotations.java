package cn.uhfun.sox.magic.base.reflection;

import sun.reflect.annotation.AnnotationParser;

import java.lang.annotation.Annotation;
import java.util.Map;

/**
 * @author fuhangbo
 */
public class Annotations {
    @SuppressWarnings("unchecked")
    public static <T extends Annotation> T annotationForMap(Class<T> type, Map<String, Object> memberValues) {
        return (T) AnnotationParser.annotationForMap(type, memberValues);
    }
}
