package com.wdf.witness.utils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @author by liuguangjin
 * @Description 通用结果集
 * @Date 20/10/19 15:43
 */
@ApiModel(value = "Result", description = "返回结果集")
public class Result {


    @ApiModelProperty(value = "是否正确")
    private Boolean flag;

    @ApiModelProperty(value = "结果代码")
    private Integer code;


    @ApiModelProperty(value = "输出消息")
    private String message;

    /**
     * 利用Object类来接收对象
     */
    @ApiModelProperty(value = "对象结果")
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
