package com.like.xiaomi;

import java.util.List;

import com.geccocrawler.gecco.GeccoEngine;
import com.geccocrawler.gecco.annotation.Gecco;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.spider.HtmlBean;

@Gecco(pipelines="consolePipeline")
public class Xyhm implements HtmlBean {

	private static final long serialVersionUID = 12L;

	@HtmlField(cssPath = "#history > div > div > ul > li > div.content")
	private List<XingyunHaoma> lists;

	public List<XingyunHaoma> getLists() {
		return lists;
	}

	public void setLists(List<XingyunHaoma> lists) {
		this.lists = lists;
	}
	
	
	
	 public static void main(String[] args) throws Exception {
		 
			
	        GeccoEngine.create()
	        //工程的包路径
	        .classpath("com.like.xiaomi")
	        //开始抓取的页面地址
	        .start("https://1.hd.mi.com/detail?pid=90950898007074&product_id=2162900002")
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
