package com.like.demo;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Attr;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.Href;
import com.geccocrawler.gecco.annotation.Html;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.RequestParameter;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;


public class MyJianShu implements HtmlBean {

    private static final long serialVersionUID = -7127412585200687225L;
    
    @Text
    @HtmlField(cssPath="li > div.content > a")
    private String title;
    
    @Href
    @HtmlField(cssPath="li > div.content > a")
    private String href;
    
	@Text
    @HtmlField(cssPath="li > div.content > p.abstract")
    private String content;

    public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getHref() {
		return href;
	}


	public void setHref(String href) {
		this.href = href;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}

    
   
}