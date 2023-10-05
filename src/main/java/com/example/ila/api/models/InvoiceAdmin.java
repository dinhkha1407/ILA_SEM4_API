package com.example.ila.api.models;

import java.math.BigDecimal;
import java.sql.Date;

public class InvoiceAdmin {
	private int id;
	private BigDecimal price;
	private Date createDate;
	private int idInvoice;
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public InvoiceAdmin(int id, BigDecimal price, Date createDate, int idInvoice, boolean status) {
		super();
		this.id = id;
		this.price = price;
		this.createDate = createDate;
		this.idInvoice = idInvoice;
		this.status = status;
	}
	public InvoiceAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
