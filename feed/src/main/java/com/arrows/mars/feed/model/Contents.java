package com.arrows.mars.feed.model;

import java.util.Date;

/**
 * 内容主体
 */
public class Contents {

    /**
     * Identification
     */
    private Long id;

    /**
     * 谁写的
     */
    private Long authorId;

    /**
     * 写的什么类型的内容 - 文章,评论,问答
     */
    private Integer contentType;

    /**
     * 内容的主题是什么,也可以没主题,随便说
     */
    private String title;

    /**
     * 写的什么内容
     */
    private String content;

    /**
     * 泼出去的水,还是可以改的
     */
    private Integer version;

    /**
     * 什么时候修改的
     */
    private Date mTime;

    /**
     * 什么时候保存的
     */
    private Date cTime;

    /**
     * 是不是删了
     */
    private Integer isDelete;

    public Contents() {
    }

    public Contents(Long id, Long authorId, Integer contentType, String title, String content, Integer version, Integer isDelete, Date mTime, Date cTime) {
        this.id = id;
        this.authorId = authorId;
        this.contentType = contentType;
        this.title = title;
        this.content = content;
        this.version = version;
        this.isDelete = isDelete;
        this.mTime = mTime;
        this.cTime = cTime;
    }

    public Contents(Long authorId, Integer contentType, String title, String content, Integer version, Integer isDelete, Date mTime, Date cTime) {
        this.authorId = authorId;
        this.contentType = contentType;
        this.title = title;
        this.content = content;
        this.version = version;
        this.isDelete = isDelete;
        this.mTime = mTime;
        this.cTime = cTime;
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

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
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
}
