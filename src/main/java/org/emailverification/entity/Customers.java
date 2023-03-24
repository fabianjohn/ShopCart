package org.emailverification.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "custome")
public class Customers {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "customer_name")
	private String customerName;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "customer_email")
	private String customerEmail;
	
	@Column(name = "customer_address")
	private String customerAddress;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state")
	private String state;
	
	@Column(name = "create_time", updatable = false)
	private Date createTime;
	private boolean enable;
	
	@Column(name = "verification_code", updatable = false)
	private String verficationCode;
	
	

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Customers(Long id, String customerEmail, String password, String customerName, String customerAddress,
			String city, String state, Date createTime, boolean enable, String verficationCode) {
		super();
		this.id = id;
		this.customerEmail = customerEmail;
		this.password = password;
		this.customerName = customerName;
		this.customerAddress = customerAddress;
		this.city = city;
		this.state = state;
		this.createTime = createTime;
		this.enable = enable;
		this.verficationCode = verficationCode;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getCustomerEmail() {
		return customerEmail;
	}



	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public Date getCreateTime() {
		return createTime;
	}



	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}



	public boolean isEnable() {
		return enable;
	}



	public void setEnable(boolean enable) {
		this.enable = enable;
	}



	public String getVerficationCode() {
		return verficationCode;
	}



	public void setVerficationCode(String verficationCode) {
		this.verficationCode = verficationCode;
	}
	
	

	
	

}
