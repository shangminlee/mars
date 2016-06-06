package com.arrows.mars.user.service;

/**
 * Created by lishangmin on 16/6/3.
 */
public interface UserService {

    /**
     * 创建用户
     */
    void create();

    /**
     * 登录
     */
    void login();

    /**
     * 获取用户信息
     */
    void getUser();

    /**
     * 修改密码
     */
    void modifyPassword();

    /**
     * 修改昵称
     */
    void modifyNickName();
}
