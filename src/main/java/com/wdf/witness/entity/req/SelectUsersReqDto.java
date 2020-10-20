package com.wdf.witness.entity.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author by liuguangjin
 * @Description 用户请求体封装
 * @Date 20/10/19 16:28
 */

@ApiModel(description = "用户查询接口入参")
public class SelectUsersReqDto {

    @ApiModelProperty(value = "用户ID")
    private String uid;

    @ApiModelProperty(value = "用户名")
    private String name;

    public SelectUsersReqDto() {
    }
    public SelectUsersReqDto(String name) {
        this.name = name;
    }
    public SelectUsersReqDto(String uid, String name) {
        this.uid = uid;
        this.name = name;
    }


    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UsersReqDto{" +
                "uid='" + uid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
