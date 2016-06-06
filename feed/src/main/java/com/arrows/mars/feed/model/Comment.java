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
     * 文章ID
     */
    private Long articleId;

    /**
     * 文章作者ID
     */
    private Long articleAuthorId;

    /**
     * 被回复评论ID
     */
    private Long commentId;

    /**
     * 评论作者ID
     */
    private Long authorId;

    /**
     * 被回复评论作者ID
     */
    private Long commentAuthorId;

    /**
     * 可见级别
     */
    private Integer visible;

    /**
     * 是否删除
     */
    private Integer isDelete;

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

    public Comment() {
    }

    public Comment(Long articleId, Long articleAuthorId, Long commentId, Long authorId, Long commentAuthorId, Integer visible, Integer isDelete, Date modifyTime, Date createTime, Date insertTime) {
        this.articleId = articleId;
        this.articleAuthorId = articleAuthorId;
        this.commentId = commentId;
        this.authorId = authorId;
        this.commentAuthorId = commentAuthorId;
        this.visible = visible;
        this.isDelete = isDelete;
        this.modifyTime = modifyTime;
        this.createTime = createTime;
        this.insertTime = insertTime;
    }
}
