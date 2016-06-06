package com.arrows.mars.feed.model;

import java.util.Date;

/**
 * Created by lishangmin on 16/6/6.
 */
public class ArticleInfo {

    /**
     * Identification
     */
    private Long id;

    /**
     * 文章ID
     */
    private Long articleId;

    /**
     * 标题
     */
    private String title;

    /**
     * 文章内容
     */
    private String content;

    /**
     * 版本
     */
    private Integer version;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 插入时间
     */
    private Date insertTime;

    public ArticleInfo() {
    }

    public ArticleInfo(Long articleId, String title, String content, Integer version, Date modifyTime, Date insertTime) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
        this.version = version;
        this.modifyTime = modifyTime;
        this.insertTime = insertTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
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

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "ArticleInfo{" +
                "id=" + id +
                ", articleId=" + articleId +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", version=" + version +
                ", modifyTime=" + modifyTime +
                ", insertTime=" + insertTime +
                '}';
    }

}
