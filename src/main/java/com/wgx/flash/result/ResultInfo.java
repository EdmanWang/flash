package com.wgx.flash.result;

public class ResultInfo<T> {

    private int code;

    private String msg;

    private T data;

    /**
     * 成功时候的调用
     */
    public static <T> ResultInfo<T> success(T data) {
        return new ResultInfo<T>(data);
    }

    /**
     * 失败时候的调用
     */
    public static <T> ResultInfo<T> error(CodeMsg cm) {
        return new ResultInfo<T>(cm);
    }

    private ResultInfo(T data) {
        this.code = 0;
        this.msg = "success";
        this.data = data;
    }

    private ResultInfo(CodeMsg cm) {
        if (cm == null) {
            return;
        }
        this.code = cm.getCode();
        this.msg = cm.getMsg();
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }
}
