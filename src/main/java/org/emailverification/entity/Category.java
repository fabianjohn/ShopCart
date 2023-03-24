package org.emailverification.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="category")
public class Category {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	public Long id;
	
	@Column(name="cat_name")
	public String catName;
	
	@Column(name="product_name")
	public String productName;
	
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(Long id, String catName, String productName) {
		super();
		this.id = id;
		this.catName = catName;
		this.productName = productName;
	}
     
	
	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", catName=" + catName + ", productName=" + productName +  "]";
	}

	
	
	
	

}
