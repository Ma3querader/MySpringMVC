package com.lakers.exception;

/**
 * @Author: panyusheng
 * @Date: 2020/5/20 9:50
 * @Version 1.0
 */
public class SysException extends Exception {

    // 异常提示信息
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SysException(String message) {
        this.message = message;
    }
}
