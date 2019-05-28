package com.model;

/**
 * @Author jhao
 * @Date 2019/5/27 8:51
 * @Description
 * @Modified by:
 */
public class ArticlePreference {

    private int articleId;
    private double score;
    private int userId;

    public int getArticleId() {
        return articleId;
    }

    public void setArticleId(int articleId) {
        this.articleId = articleId;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
