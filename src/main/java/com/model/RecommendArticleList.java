package com.model;


import com.pojo.Article;
import com.service.ArticleService;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RecommendArticleList {
	private List<RecommendArticle> recommendArticles = new ArrayList<RecommendArticle>();

	private List<String> articleList;



	@Autowired
	ArticleService articleService;

	public RecommendArticleList(){
		
	}
	public RecommendArticleList(List<RecommendedItem> items){
		articleList = new ArrayList<String>();
		for (RecommendedItem item : items){
			articleList.add(String.valueOf(item.getItemID()));
		}
		
		Map<String,Article> articles = articleService.getArticleMap(articleList);
		
		for (RecommendedItem item : items){
			String articleId = String.valueOf(item.getItemID());
			//Movie movie = movies.get(movieID);
			Article article = articles.get(articleId);
			if(article != null){
				RecommendArticle rm = new RecommendArticle(article, item.getValue());
				recommendArticles.add(rm);
			}
		}
	}

	public List<RecommendArticle> getRecommendArticles() {
		return recommendArticles;
	}

	public void setRecommendArticles(List<RecommendArticle> recommendArticles) {
		this.recommendArticles = recommendArticles;
	}

	public List<String> getArticleList() {
		return articleList;
	}

	public void setArticleList(List<String> articleList) {
		this.articleList = articleList;
	}
	
}
