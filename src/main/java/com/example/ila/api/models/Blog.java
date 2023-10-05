package com.example.ila.api.models;

import java.sql.Date;

public class Blog {
	private int id;
	private String title;
	private String image;
	private String description;
	private Date createDate;
	private int idAccount;
	private int userCreate;
	private int isStatus;
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
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public int getUserCreate() {
		return userCreate;
	}
	public void setUserCreate(int userCreate) {
		this.userCreate = userCreate;
	}
	public int getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(int isStatus) {
		this.isStatus = isStatus;
	}
	public Blog(int id, String title, String image, String description, Date createDate, int idAccount, int userCreate,
			int isStatus) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.description = description;
		this.createDate = createDate;
		this.idAccount = idAccount;
		this.userCreate = userCreate;
		this.isStatus = isStatus;
	}
	public Blog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
