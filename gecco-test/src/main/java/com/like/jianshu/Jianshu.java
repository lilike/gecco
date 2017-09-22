package com.like.jianshu;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Ajax;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;
@Gecco(pipelines = "consolePipeline")
public class Jianshu implements HtmlBean {

	private static final long serialVersionUID = -6272973291393342215L;

	@Ajax(url = "https://1.hd.mi.com/api/product/published?product_id=2164300003&page_index=2&page_size=8&jsonpcallback=jQuery111308639376168578781_1498808079585&_=1498808079587")
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
        .classpath("com.like.jianshu")
        //开始抓取的页面地址
        .start("https://1.hd.mi.com/detail?pid=91054600009296&product_id=2164300003")
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
