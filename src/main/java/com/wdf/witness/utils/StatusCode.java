package com.wdf.witness.utils;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author by liuguangjin
 * @Description 状态码维护类
 * @Date 20/10/19 15:06
 */

@ApiModel(value = "StatusCode", description = "状态码维护类")
public class StatusCode {

    /**
     * 成功
     */
    @ApiModelProperty(value = "成功")
    public static final int OK=970314;

    /**
     * 失败
     */
    @ApiModelProperty(value = "失败")
    public static final int ERROR =20001;

    /**
     * 用户名或密码错误
     */
    @ApiModelProperty(value = "用户名或密码错误")
    public static final int LOGINERROR =20002;

    /**
     * 权限不足
     */
    public static final int ACCESSERROR =20003;

    /**
     * 远程调用失败
     */
    public static final int REMOTEERROR =20004;

    /**
     * 重复操作
     */
    public static final int REPERROR =20005;

    @ApiModelProperty(value = "为空")
    public static final int  ISEMPTY =20006;

    /**
     * 新增成功
     */
    public static final String Add ="新增成功";

    /**
     * 删除成功
     */
    public static final String delete ="删除成功";

    /**
     * 查询成功
     */
    public static final String select ="查询成功";

    /**
     * 更新成功
     */
    public static final String update ="更新成功";


    public static final String APPLICATION_JSON_UTF8_VALUE = "application/json;charset=UTF-8";
}
