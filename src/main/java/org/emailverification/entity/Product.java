package org.emailverification.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product implements Serializable{
	
	private static final long serialVersionUID = -1000119078147252957L;
	
	@Id
    @Column(name = "Code", length = 20, nullable = false)
	private String code;
	
	@Column(name = "Name", length = 255, nullable = false)
	private String name;
	
	private String description;
	
	@Column(name = "Price", nullable = false)
	private Double price;
	
	@Lob
    @Column(name = "Image", length = Integer.MAX_VALUE, nullable = true)
	private byte[] image;
	
	@Column(name="upload_time")
	private Date uploadTime;
	
	
	
	
	public Product() {
		
	}
	
	public Product(String code, String name, String description, Double price, byte[] image, Date uploadTime) {
		super();
		this.code = code;
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
		this.uploadTime = uploadTime;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Date getUploadTime() {
		return uploadTime;
	}

	public void setUploadTime(Date uploadTime) {
		this.uploadTime = uploadTime;
	}

		

}
