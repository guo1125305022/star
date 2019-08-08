package com.start.common;

import java.util.HashMap;

/**
 * 服务器处理返回结果
 */
public class Result extends HashMap<String, Object> implements CommonConstant.WebResult {
    private Result(int code, String message, Object data) {
        put(KEY_CODE, code);
        put(KEY_MESSAGE, message);
        put(KEY_MSG, message);
        put(KEY_DATA, data);
    }

    private static Result create(int code, String message, Object data) {
        return new Result(code, message, data);
    }

    public static Result ok(String message, Object data) {
        return create(CODE_OK, message, data);
    }

    public static Result ok(Object data) {
        return ok(MESSAGE_DEFAULT_OK, data);
    }

    public static Result fail(String message) {
        return fail(CODE_FAIL, MESSAGE_DEFAULT_FAIL);
    }

    /**
     * 服务器处理失败
     *
     * @param code
     * @param message
     * @return
     */
    public static Result fail(int code, String message) {
        return create(code, message, null);
    }

    /**
     * 登录过期
     *
     * @return
     */
    public static Result loginOverDue() {
        return fail(CODE_LOGIN_OVERDUE, MESSAGE_DEFAULT_LOGIN_OVERDUE);
    }


}
