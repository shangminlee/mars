package com.arrows.mars.user.service;

/**
 * Created by lishangmin on 16/6/3.
 */
public interface UserService {

    /**
     * 创建用户
     */
    void create(String userName,String nickName,String mobile,String email);

    /**
     * 登录
     */
    void login(String userName,String password);

    /**
     * 获取用户信息
     */
    void getUser(String userName);

    /**
     * 获取用户信息
     */
    void getUser(Long userId);

    /**
     * 修改密码
     */
    void modifyPassword(String userName,String password,String modifiedPassword);

    /**
     * 修改密码
     */
    void modifyPassword(Long userId,String password,String modifiedPassword);

    /**
     * 修改昵称
     */
    void modifyNickName(String userName,String password,String modifiedNickName);

    /**
     * 修改昵称
     */
    void modifyNickName(Long userId,String password,String modifiedNickName);
}
