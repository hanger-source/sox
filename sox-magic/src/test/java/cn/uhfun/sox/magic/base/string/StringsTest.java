package cn.uhfun.sox.magic.base.string;

import org.junit.Assert;
import org.junit.Test;

public class StringsTest {

    @Test
    public void substringBetween() {
        Assert.assertEquals(Strings.substringBetween("firstXxxLast>", "first", "Last"), "Xxx");
    }
}