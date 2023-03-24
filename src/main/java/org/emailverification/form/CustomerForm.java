package org.emailverification.form;

import org.emailverification.model.CustomerInfo;

public class CustomerForm {
	private String name;
	private String address;
	private String email;
	private String phone;
	public CustomerForm() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public CustomerForm(CustomerInfo customerInfo) {
		super();
		this.name = customerInfo.getName();
		this.address = customerInfo.getAddress();
		this.email = customerInfo.getEmail();
		this.phone = customerInfo.getPhone();
	}



	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

}
