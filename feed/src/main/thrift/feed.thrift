
/**
 * 文章模型
**/
struct ArticleModel{

}

/**
 * 评论模型
**/
struct CommentModel{

}





//博客后台服务
service feed{

    /**
     * 发布文章
    **/
    ArticleModel createArticle(1:i64 author_id,2:string title,3:string content,4:string article_type)

    /**
     * 发布评论
    **/
    CommentModel createComment(1:i64 author_id,2:i64 article_id,3:string content)

    /**
     * 回复评论
    **/
    void reply(1:i64 author_id,2:i64 comment_id,3:string content)

    /**
     * 获取评论
    **/
    void getComment(1:i64 comment_id)

    /**
     * 获取评论列表
    **/
    void getComments(1:i64 article_id)

    /**
     * 获取观点
    **/
    void getArticle(1:i64 article_id)

    /**
     * 获取观点列表
    **/
    void getArticles(1:i64 author_id)

}