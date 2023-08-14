package com.example.ila.api.ModelView;

import java.sql.Date;

public class CommentBlogView {
	private int id;
	private int idBlog;
	private int idAccount;
	private String comment;
	private String reply;
	private Date commentDate;  
	private Date replyDate;
	
	
	//account
	private String nameCus;
	private String nameSupp;
	private int idCus;
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
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public Date getReplyDate() {
		return replyDate;
	}
	public void setReplyDate(Date replyDate) {
		this.replyDate = replyDate;
	}
	public String getNameCus() {
		return nameCus;
	}
	public void setNameCus(String nameCus) {
		this.nameCus = nameCus;
	}
	public String getNameSupp() {
		return nameSupp;
	}
	public void setNameSupp(String nameSupp) {
		this.nameSupp = nameSupp;
	}
	public int getIdCus() {
		return idCus;
	}
	public void setIdCus(int idCus) {
		this.idCus = idCus;
	}
	public CommentBlogView(int id, int idBlog, int idAccount, String comment, String reply, Date commentDate,
			Date replyDate, String nameCus, String nameSupp, int idCus) {
		super();
		this.id = id;
		this.idBlog = idBlog;
		this.idAccount = idAccount;
		this.comment = comment;
		this.reply = reply;
		this.commentDate = commentDate;
		this.replyDate = replyDate;
		this.nameCus = nameCus;
		this.nameSupp = nameSupp;
		this.idCus = idCus;
	}
	public CommentBlogView() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
