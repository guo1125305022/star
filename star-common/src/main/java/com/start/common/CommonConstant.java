package com.start.common;

public interface CommonConstant {
    interface WebResult {
        /**
         * 服务器处理成功
         */
        int CODE_OK = 200;
        /**
         * 服务器处理失败
         */
        int CODE_FAIL = 500;
        /**
         * 用户登录过期
         */
        int CODE_LOGIN_OVERDUE = -1;
        /**
         * 服务器处理消息
         */
        String KEY_MESSAGE = "message";
        /**
         * 服务器处理消息
         */
        String KEY_MSG = "msg";
        /**
         * 服务器处理后返回数据
         */
        String KEY_DATA = "data";
        /**
         * 服务器处理编码
         */
        String KEY_CODE = "code";

        String MESSAGE_DEFAULT_OK = "操作成功";
        String MESSAGE_DEFAULT_FAILD="未知异常，请联系管理员";
        String MESSAGE_DEFAULT_LOGIN_OVERDUE="您的登录已经过期";
    }
}
