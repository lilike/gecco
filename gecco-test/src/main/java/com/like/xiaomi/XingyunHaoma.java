package com.like.xiaomi;

import com.geccocrawler.gecco.annotation.Ajax;
import com.geccocrawler.gecco.annotation.HtmlField;
import com.geccocrawler.gecco.annotation.JSONPath;
import com.geccocrawler.gecco.annotation.Text;
import com.geccocrawler.gecco.spider.HtmlBean;

public class XingyunHaoma implements HtmlBean {

	private static final long serialVersionUID = 1L;

	@Text
	@HtmlField(cssPath="div.content > p.sub-tit > a")
	private String qishu; // 期数
	
	@Text
	@HtmlField(cssPath="div.content > p.code > span")
	private String luckyCode;
	
	@Text
	@HtmlField(cssPath="div.content > p.num > span")
	private String total;

	
	@Ajax(url="https://1.hd.mi.com/api/product/published?product_id=2162900002&page_index=5&page_size=8&jsonpcallback=jQuery1113038453308848264944_1498717746394&_=1498717746399")
	private String haha;
	
	
	public String getQishu() {
		return qishu;
	}

	public void setQishu(String qishu) {
		this.qishu = qishu;
	}

	public String getLuckyCode() {
		return luckyCode;
	}

	public void setLuckyCode(String luckyCode) {
		this.luckyCode = luckyCode;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getHaha() {
		return haha;
	}

	public void setHaha(String haha) {
		this.haha = haha;
	}
	
	
	
	
	
	
	
}
