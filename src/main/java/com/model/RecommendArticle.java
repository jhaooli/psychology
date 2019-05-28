package com.model;

import com.pojo.Article;

public class RecommendArticle {
	private static final String ARTICLE = "article";
	private static final String VALUE = "score";
	
	
	private Article article;
	private double value;
	
	public RecommendArticle(Article article, float value){
		this.article = article;
		this.value = value;
	}


	public double getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}


	public static String getARTICLE() {
		return ARTICLE;
	}

	public static String getVALUE() {
		return VALUE;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}
}
