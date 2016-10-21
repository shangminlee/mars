package com.arrows.mars.feed.model;

import java.util.Date;

/**
 * Created by lishangmin on 16/6/6.
 */
public class Comment {

    /**
     * Identification
     */
    private Long id;

    /**
     * 在哪说的
     */
    private Long topicId;

    /**
     * 谁说的
     */
    private Long authorId;

    /**
     * 说了什么
     */
    private Long contentId;

    /**
     * 对谁说-对事不对人,只针对内容
     */
    private Long toId;

    /**
     * 谁能看见 0:全部能看见,1:仅自己可见
     */
    private Integer visible;

    /**
     * 什么时候改动了
     */
    private Date mTime;

    /**
     * 什么时候说的
     */
    private Date cTime;

    /**
     * 是不是收回说出去的话
     */
    private Integer isDelete;

    public Comment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
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

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Integer getVisible() {
        return visible;
    }

    public void setVisible(Integer visible) {
        this.visible = visible;
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
