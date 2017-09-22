package com.like.zhihu;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(matchUrl="http://www.zhihu.com",pipelines = "consolePipeline")
public class Article implements HtmlBean {

	private static final long serialVersionUID = -9161117697525164208L;

	@Text
	@HtmlField(cssPath = "#zh-top-link-logo")
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public static void main(String[] args) {
		
	       GeccoEngine.create()
	        //工程的包路径
	        .classpath("com.like.zhihu")
	        //开始抓取的页面地址
	        .start("http://www.zhihu.com")
	        //开启几个爬虫线程
	        .thread(1)
	        //单个爬虫每次抓取完一个请求后的间隔时间
	        .interval(2000)
	        //循环抓取
	        .loop(false)
	        //使用pc端userAgent
	        .mobile(false).debug(false)
	        //非阻塞方式运行
	        .start();
	        System.out.println("抓取");
	}
	
	
}
