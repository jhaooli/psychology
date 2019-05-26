package com.model;

/**
 * @Author jhao
 * @Date 2019/5/26 23:42
 * @Description
 * @Modified by:
 */
public class ArticleSimilarity {

    private int article1Id;
    private int article2Id;
    private double similarity;

    @Override
    public String toString() {
        return "ArticleSimilarity{" +
                "article1Id=" + article1Id +
                ", article2Id=" + article2Id +
                ", similarity=" + similarity +
                '}';
    }

    public int getArticle1Id() {
        return article1Id;
    }

    public void setArticle1Id(int article1Id) {
        this.article1Id = article1Id;
    }

    public int getArticle2Id() {
        return article2Id;
    }

    public void setArticle2Id(int article2Id) {
        this.article2Id = article2Id;
    }

    public double getSimilarity() {
        return similarity;
    }

    public void setSimilarity(double similarity) {
        this.similarity = similarity;
    }
}
