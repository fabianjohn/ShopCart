package org.emailverification.form;

import org.emailverification.entity.Product;
import org.springframework.web.multipart.MultipartFile;

public class ProductForm {
	
	private String code;
    private String name;
    private double price;

    private boolean newProduct = false;
    
 // Upload file.
    private MultipartFile fileData;
    
	public ProductForm(boolean newProduct) {
	super();
	this.newProduct = newProduct;
}

	public ProductForm(Product product) {
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isNewProduct() {
		return newProduct;
	}

	public void setNewProduct(boolean newProduct) {
		this.newProduct = newProduct;
	}

	public MultipartFile getFileData() {
		return fileData;
	}

	public void setFileData(MultipartFile fileData) {
		this.fileData = fileData;
	}
	
	
    
    

}
