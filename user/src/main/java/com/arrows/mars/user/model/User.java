package com.arrows.mars.user.model;

import java.util.Date;

/**
 * Created by lishangmin on 16/6/6.
 */
public class User {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 昵称
     */
    private String nickName;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String mobile;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 修改时间
     */
    private Date mTime;

    /**
     * 插入时间
     */
    private Date cTime;

    public User() {
    }

    public User(String userName, String nickName, String email, String mobile, Integer version, Date mTime, Date cTime) {
        this.userName = userName;
        this.nickName = nickName;
        this.email = email;
        this.mobile = mobile;
        this.version = version;
        this.mTime = mTime;
        this.cTime = cTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getmTime() {
        return mTime;
    }

    public void setmTime(Date mTime) {
        this.mTime = mTime;
    }

    public Date getcTime() {
        return cTime;
    }

    public void setcTime(Date cTime) {
        this.cTime = cTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", version=" + version +
                ", mTime=" + mTime +
                ", cTime=" + cTime +
                '}';
    }
}
