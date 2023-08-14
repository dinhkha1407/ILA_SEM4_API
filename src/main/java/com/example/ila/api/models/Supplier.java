package com.example.ila.api.models;

import java.sql.Date;

public class Supplier {
	private int id;
	private String title;
	private String phone;
	private String email;
	private String address;
	private String username;
	private String password;
	private Date requestDate;
	private Date createDate;
	private int isActive;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getRequestDate() {
		return requestDate;
	}
	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public Supplier(int id, String title, String phone, String email, String address, String username, String password,
			Date requestDate, Date createDate, int isActive) {
		super();
		this.id = id;
		this.title = title;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.username = username;
		this.password = password;
		this.requestDate = requestDate;
		this.createDate = createDate;
		this.isActive = isActive;
	}
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
