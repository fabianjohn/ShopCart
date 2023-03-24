package org.emailverification.model;

import org.emailverification.entity.Product;

public class ProductInfo {
	
	private String code;
	
	private String name;
	
	private Double price;
	
	public ProductInfo(Product product) {
		super();
		this.code = product.getCode();
		this.name = product.getName();
		this.price = product.getPrice();
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
