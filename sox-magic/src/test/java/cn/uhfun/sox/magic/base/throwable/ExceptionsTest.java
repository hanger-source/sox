package cn.uhfun.sox.magic.base.throwable;

import org.junit.Test;

public class ExceptionsTest {

    @Test
    public void getCausalChain() {
        Exceptions.getCausalChain(new IllegalArgumentException(new NullPointerException()));
    }
}