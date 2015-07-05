package org.javadude.trade.vo;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Trade {

	private String tradeId;
	private String productId;
	private String tradeName;
	private String tradeSource;
	private String tradeMarket;
	private int tradePrice;
	private String status;
	private Product product;
	
	public String getTradeId() {
		return tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public String getTradeSource() {
		return tradeSource;
	}
	public void setTradeSource(String tradeSource) {
		this.tradeSource = tradeSource;
	}
	public String getTradeMarket() {
		return tradeMarket;
	}
	public void setTradeMarket(String tradeMarket) {
		this.tradeMarket = tradeMarket;
	}
	public int getTradePrice() {
		return tradePrice;
	}
	public void setTradePrice(int tradePrice) {
		this.tradePrice = tradePrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Trade(){}
	
	
	
	public Trade(String tradeId, String productId, String tradeName,
			String tradeSource, String tradeMarket) {
		super();
		this.tradeId = tradeId;
		this.productId = productId;
		this.tradeName = tradeName;
		this.tradeSource = tradeSource;
		this.tradeMarket = tradeMarket;
	}
	public String toString(){
		return "\nTrade Id : "+getTradeId()+"\n"+
				"Product Id : "+getProductId()+"\n"+
	           "Trade Name : "+getTradeName()+"\n"+
			   "Trade Source : "+getTradeSource()+"\n"+
	           "Trade Market : "+getTradeMarket()+"\n"+
			   "Trade Price : "+getTradePrice()+"\n"+
	           ""+getProduct()+"\n"+
	           "Trade Status : "+getStatus();
	}
	
	
}
