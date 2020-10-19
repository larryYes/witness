package com.wdf.witness.entity;

/**
 * @author by liuguangjin
 * @Description TODO
 * @Date 20/10/19 14:36
 */


public class Users {

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 用户名
     */
    private String name;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户邮箱
     */
    private String mail;

    /**
     * 用户链接
     */
    private String url;


    /**
     * 构造器
     */
    public Users() {
    }
    public Users(Integer uid, String name, String password, String mail, String url) {
        this.uid = uid;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.url = url;
    }

    /**
     * toString
     * @return
     */
    @Override
    public String toString() {
        return "Users{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                ", url='" + url + '\'' +
                '}';
    }


    /**
     * getter/setter
     * @return
     */
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
