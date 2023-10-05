package com.example.ila.api.models;

import java.sql.Date;

public class Review {
	private int id;
	private int idAccount;
	private int idProduct;
	private int review;
	private Date createDate;
	private int countReview;
	private int countFilter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public int getReview() {
		return review;
	}
	public void setReview(int review) {
		this.review = review;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getCountReview() {
		return countReview;
	}
	public void setCountReview(int countReview) {
		this.countReview = countReview;
	}
	public int getCountFilter() {
		return countFilter;
	}
	public void setCountFilter(int countFilter) {
		this.countFilter = countFilter;
	}
	public Review(int id, int idAccount, int idProduct, int review, Date createDate, int countReview, int countFilter) {
		super();
		this.id = id;
		this.idAccount = idAccount;
		this.idProduct = idProduct;
		this.review = review;
		this.createDate = createDate;
		this.countReview = countReview;
		this.countFilter = countFilter;
	}
	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
