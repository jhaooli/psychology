package com.service;

import com.model.ArticleSimilarity;
import com.pojo.Article;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.similarity.GenericItemSimilarity;

import java.util.List;
import java.util.Map;

/**
 * @Author jhao
 * @Date 2019/5/26 23:36
 * @Description
 * @Modified by:
 */
public interface ArticleService {

    //获取所有的文章
    List<Article> listAllArticles();


    //根据文章ID获取单个文章
    List<Article> getArticleByArticleId(Article article);

    //根据文章ID获取多个文章
    List<Article> getArticleByArticleId(List<String> articles);

    //获取文章相似度
    List<GenericItemSimilarity.ItemItemSimilarity> listAllArticleSimilarity();

    //添加文章相似度
    int insertSimilarity(ArticleSimilarity articleSimilarity);

    //返回推荐文章
    List<Article> listSimilarityArticle(int userId,int howmany) throws TasteException;

    //获取文章map id对article内容
    Map<String,Article> getArticleMap(List list);
}
