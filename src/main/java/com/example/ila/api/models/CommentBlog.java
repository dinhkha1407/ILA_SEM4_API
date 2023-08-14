package com.example.ila.api.models;

public class CommentBlog {
	private int id;
	private int idBlog;
	private int idAccount;
	private String comment;
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
	public CommentBlog(int id, int idBlog, int idAccount, String comment) {
		super();
		this.id = id;
		this.idBlog = idBlog;
		this.idAccount = idAccount;
		this.comment = comment;
	}
	public CommentBlog() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
