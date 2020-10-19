package com.wdf.witness.utils;

import java.io.Serializable;

/**
 * @author by liuguangjin
 * @Description 通用结果集
 * @Date 20/10/19 15:43
 */

public class Result {

    /**
     * 是否正确
     */
    private Boolean flag;

    /**
     *结果代码
     */
    private Integer code;

    /**
     *输出消息
     */
    private String message;

    /**
     * 利用Object类来接收对象
     */
    private Object data;

    /**
     * 三个构造方法
     */
    public Result() {
    }

    public Result(Boolean flag, Integer code, String message) {
        this.flag = flag;
        this.code = code;
        this.message = message;
    }

    public Result(Boolean flag, Integer code, String message, Object data) {
        this.flag = flag;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * getter、setter方法
     * @return
     */
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Result{" +
                "flag=" + flag +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
