package com.wdf.witness.entity.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 17:32
 */

@ApiModel(description = "文章查询接口入参")
public class SelectContentsReqDto {

    @ApiModelProperty(value = "关键词")
    private String keywords;

    @ApiModelProperty(value = "文章标题")
    private String title;

    @ApiModelProperty(value = "文章内容")
    private String text;

    public SelectContentsReqDto() {
    }


    public SelectContentsReqDto(String title) {
        this.title = title;
    }


    public SelectContentsReqDto(String keywords, String title, String text) {
        this.keywords = keywords;
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return "SelectContentsReqDto{" +
                "keywords=" + keywords +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public String getTid() {
        return keywords;
    }

    public void setTid(String keywords) {
        this.keywords = keywords;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
