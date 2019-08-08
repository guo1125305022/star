package com.start.common.exceptions;

public class ValidException extends RuntimeException {
    public ValidException() {
    }

    public ValidException(String s) {
        super(s);
    }

    public ValidException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public ValidException(Throwable throwable) {
        super(throwable);
    }

    public ValidException(String s, Throwable throwable, boolean b, boolean b1) {
        super(s, throwable, b, b1);
    }
}
