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
     * 作者ID
     */
    private Long authorId;

    /**
     * 可见级别 0：全部可见，1：仅自己可见
     */
    private Integer visible;

    /**
     * 删除观点 0：有效，1：删除
     */
    private Integer isDelete;

    /**
     * 文章类型
     */
    private String articleType;

    /**
     * 修改时间
     */
    private Date modifyTime;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 保存时间
     */
    private Date insertTime;

    public Article() {
    }

    public Article(Long authorId, Integer visible, Integer isDelete, String articleType, Date modifyTime, Date createTime, Date insertTime) {
        this.authorId = authorId;
        this.visible = visible;
        this.isDelete = isDelete;
        this.articleType = articleType;
        this.modifyTime = modifyTime;
        this.createTime = createTime;
        this.insertTime = insertTime;
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

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", authorId=" + authorId +
                ", visible=" + visible +
                ", isDelete=" + isDelete +
                ", articleType='" + articleType + '\'' +
                ", modifyTime=" + modifyTime +
                ", createTime=" + createTime +
                ", insertTime=" + insertTime +
                '}';
    }
}
