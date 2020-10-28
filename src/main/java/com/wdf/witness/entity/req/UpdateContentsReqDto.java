package com.wdf.witness.entity.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 17:39
 */

@ApiModel(description = "更新文章接口入参")
public class UpdateContentsReqDto {

    @ApiModelProperty(value = "文章标题")
    private String title;

    @ApiModelProperty(value = "文章内容")
    private String text;

    @ApiModelProperty(value = "打卡完成时间")
    private Date doneDate;


    public UpdateContentsReqDto() {
    }

    public UpdateContentsReqDto(String title, String text, Date doneDate) {
        this.title = title;
        this.text = text;
        this.doneDate = doneDate;
    }

    @Override
    public String toString() {
        return "UpdateContentsReqDto{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", doneDate=" + doneDate +
                '}';
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

    public Date getDoneDate() {
        return doneDate;
    }

    public void setDoneDate(Date doneDate) {
        this.doneDate = doneDate;
    }
}
