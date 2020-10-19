package com.wdf.witness.entity.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author by liuguangjin
 * @Description 用户请求体封装
 * @Date 20/10/19 16:28
 */

@ApiModel(description = "用户接口入参")
public class UsersReqDto {

    @ApiModelProperty(value = "用户ID")
    private String uid;

    @ApiModelProperty(value = "用户名")
    private String name;

}
