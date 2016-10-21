package com.arrows.mars.feed.service;

/**
 * 博客后台服务
 * @author arrows
 */
public interface FeedService {

    /**
     * 发布文章
     */
    void createArticle();

    /**
     * 修改文章
     */
    void modifyArticle();

    /**
     * 删除文章
     */
    void deleteArticle();

    /**
     * 恢复已删除文章
     */
    void recoverArticle();

    /**
     * 发布评论
     */
    void createComment();

    /**
     * 回复评论
     */
    void reply();

    /**
     * 删除评论
     */
    void deleteComment();

    /**
     * 获取文章
     */
    void getArticle();

    /**
     * 获取评论
     */
    void getComment();

    /**
     * 获取文章列表
     */
    void getArticles();

    /**
     * 获取评论列表
     */
    void getComments();
}
