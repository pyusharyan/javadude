package org.javadude.product;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Product {

	private String productId;
	private String productName;
	private String manufacturer;
	private Date yearOfManufacture;
	private int price;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getYearOfManufacture() {
		return yearOfManufacture;
	}
	public void setYearOfManufacture(Date yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("Product Id : "+productId+"\n");
		sb.append("product Name : "+productName+"\n");
		sb.append("Product Manufacturer : "+manufacturer+"\n");
		sb.append("Product Price : "+price+"\n");
		sb.append("Year of Manufacture : "+yearOfManufacture);
		return sb.toString();
	}
	
}
