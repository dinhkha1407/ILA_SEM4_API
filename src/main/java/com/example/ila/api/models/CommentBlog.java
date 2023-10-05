package com.example.ila.api.models;

import java.sql.Date;

public class CommentBlog {
	private int id;
	private int idBlog;
	private int idAccount;
	private String comment;
	private Date createDate;
	private int indC;
	private int mnC;
	private int status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdBlog() {
		return idBlog;
	}
	public void setIdBlog(int idBlog) {
		this.idBlog = idBlog;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getIndC() {
		return indC;
	}
	public void setIndC(int indC) {
		this.indC = indC;
	}
	public int getMnC() {
		return mnC;
	}
	public void setMnC(int mnC) {
		this.mnC = mnC;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public CommentBlog(int id, int idBlog, int idAccount, String comment, Date createDate, int indC, int mnC,
			int status) {
		super();
		this.id = id;
		this.idBlog = idBlog;
		this.idAccount = idAccount;
		this.comment = comment;
		this.createDate = createDate;
		this.indC = indC;
		this.mnC = mnC;
		this.status = status;
	}
	public CommentBlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
