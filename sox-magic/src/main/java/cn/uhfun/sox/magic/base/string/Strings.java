package cn.uhfun.sox.magic.base.string;

import org.apache.commons.lang3.StringUtils;

/**
 * @author fuhangbo
 */
public class Strings {
    public static String substringBetween(String str, String open, String close) {
        return StringUtils.substringBetween(str, open, close);
    }
}
