package com.wdf.witness.entity;

import java.io.Serializable;
import java.util.Date;
import com.alibaba.fastjson.annotation.JSONField;
/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/26 17:00
 */
public class Contents implements Serializable {

    /**
     * 文章ID
     */
    private Integer cid;

    /**
     * 文章标题
     */
    private String title;

    /**
     * 关键词
     */
    private String keywords;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 文章内容
     */
    private String text;

    /**
     * 作者Id
     */
    private Integer uid;

    /**
     * 更新日期
     */
    @JSONField(format ="yyyy-MM-dd")
    private Date modified_by;

    /**
     * 是否完成
     */
    private String is_done;


    @Override
    public String toString() {
        return "Contents{" +
                "cid=" + cid +
                ", title='" + title + '\'' +
                ", keywords='" + keywords + '\'' +
                ", created=" + created +
                ", text='" + text + '\'' +
                ", uid=" + uid +
                ", modified_by=" + modified_by +
                ", is_done=" + is_done +
                '}';
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTid() {
        return keywords;
    }

    public void setTid(Integer tid) {
        this.keywords = keywords;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getKeywords() {
        return keywords;
    }

    public Date getModified_by() {
        return modified_by;
    }

    public void setModified_by(Date modified_by) {
        this.modified_by = modified_by;
    }

    public String getIs_done() {
        return is_done;
    }

    public void setIs_done(String is_done) {
        this.is_done = is_done;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }
}
