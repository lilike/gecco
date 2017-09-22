package com.like.zhihu;

import java.util.List;

import org.apache.http.HttpRequest;

import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.spider.HtmlBean;


public class ArticleList implements HtmlBean  {

	@Request
	HttpRequest request;
	/**
	 * 
	 */
	private static final long serialVersionUID = -2587835237831114853L;
	
	@HtmlField(cssPath = "#feed-1 > div.feed-item-inner")
	private List<Article> articles;

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
}
