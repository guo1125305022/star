package com.start.common.exceptions;

/**
 * 业务异常
 */
public class BusException extends RuntimeException {
    public BusException() {
    }

    public BusException(String s) {
        super(s);
    }

    public BusException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BusException(Throwable throwable) {
        super(throwable);
    }

    public BusException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
