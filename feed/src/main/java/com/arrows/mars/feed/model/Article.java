package com.arrows.mars.feed.model;

import java.util.Date;

/**
 * Created by lishangmin on 16/6/6.
 */
public class Article {

    /**
     * Identification
     */
    private Long id;

    /**
     * 谁写的
     */
    private Long authorId;

    /**
     * 写了什么
     */
    private Long contentId;

    /**
     * 谁能看见 0：全部可见，1：仅自己可见
     */
    private Integer visible;

    /**
     * 这篇文章是什么类型的
     */
    private String articleType;

    /**
     * 什么时候修改过
     */
    private Date mTime;

    /**
     * 什么时候写的
     */
    private Date cTime;

    /**
     * 删除观点 0：有效，1：删除
     */
    private Integer isDelete;

    public Article() {
    }

    public Article(Long id, Long authorId, Long contentId, Integer visible, String articleType, Date mTime, Date cTime, Integer isDelete) {
        this.id = id;
        this.authorId = authorId;
        this.contentId = contentId;
        this.visible = visible;
        this.articleType = articleType;
        this.mTime = mTime;
        this.cTime = cTime;
        this.isDelete = isDelete;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long authorId) {
        this.authorId = authorId;
    }

    public Long getContentId() {
        return contentId;
    }

    public void setContentId(Long contentId) {
        this.contentId = contentId;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
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

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
