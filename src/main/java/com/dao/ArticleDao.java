package com.dao;

import com.model.ArticleSimilarity;
import com.pojo.Article;

import java.util.List;

/**
 * @Author jhao
 * @Date 2019/5/26 23:28
 * @Description
 * @Modified by:
 */
public interface ArticleDao {

    //获取所有的文章
    List<Article> listAllArticles();


    //根据文章ID获取文章
    List<Article> getArticleByArticleId(Article article);

    //获取文章相似度

    //添加文章相似度
    int insertSimilarity(ArticleSimilarity articleSimilarity);
}
