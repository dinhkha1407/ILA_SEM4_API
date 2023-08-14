package com.example.ila.api.models;

import java.sql.Date;

public class Account {
	private int id;
	private String avatar;
	private String username;
	private String password;
	private String name;
	private String phone;
	private String email;
	private String address;
	private Date createDate;
	private boolean isActive;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int id, String avatar, String username, String password, String name, String phone, String email,
			String address, Date createDate, boolean isActive) {
		super();
		this.id = id;
		this.avatar = avatar;
		this.username = username;
		this.password = password;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.createDate = createDate;
		this.isActive = isActive;
		
	}
	
	
	
}
