package cn.uhfun.sox.magic.base.throwable;

import com.google.common.base.Throwables;

import java.util.List;

/**
 * @author fuhangbo
 */
public class Exceptions {
    public static List<Throwable> getCausalChain(Throwable throwable) {
        return Throwables.getCausalChain(throwable);
    }
}
