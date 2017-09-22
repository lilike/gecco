package com.like.demo;

import java.util.List;

import org.apache.http.HttpRequest;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.Request;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(pipelines="consolePipeline")
public class Jianshu implements HtmlBean {
	
	@Request
	private HttpRequest request;
	
	private static final long serialVersionUID = 2L;
	
	@HtmlField(cssPath = "#list-container > ul > li")
	private List<MyJianShu> jianshus;
	

	 public static void main(String[] args) throws Exception {
		 
			
	        GeccoEngine.create()
	        //工程的包路径
	        .classpath("com.like.demo")
	        //开始抓取的页面地址
	        .start("http://www.jianshu.com/?page=1")
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


	public List<MyJianShu> getJianshus() {
		return jianshus;
	}


	public void setJianshus(List<MyJianShu> jianshus) {
		this.jianshus = jianshus;
	}

}
