package com.service.Impl;

import com.dao.ArticleDao;
import com.model.ArticleSimilarity;
import com.model.RecommendArticleList;
import com.pojo.Article;
import com.recommender.ArticleRecommender;
import com.service.ArticleService;
import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.similarity.GenericItemSimilarity;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author jhao
 * @Date 2019/5/26 23:36
 * @Description
 * @Modified by:
 */
@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleDao articleDao;

    //@Autowired
    //ArticleRecommender articleRecommender;

    @Override
    public List<Article> listAllArticles() {
        return null;
    }

    @Override
    public List<Article> getArticleByArticleId(Article article) {
        return null;
    }

    @Override
    public List<Article> getArticleByArticleId(List<String> articles) {
        return null;
    }

    @Override
    public List<GenericItemSimilarity.ItemItemSimilarity> listAllArticleSimilarity() {
        return null;
    }

    @Override
    public int insertSimilarity(ArticleSimilarity articleSimilarity) {
        return 0;
    }

    @Override
    public List<Article> listSimilarityArticle(int userId, int howmany) throws TasteException {
//       // List<RecommendedItem> articles = articleRecommender.recommend((long)userId,howmany,null);
//        RecommendArticleList articleList = new RecommendArticleList(articles);
//
//        return getArticleByArticleId(articleList.getArticleList());
        return null;
    }

    @Override
    public Map<String,Article> getArticleMap(List list) {
        return null;
    }
}
