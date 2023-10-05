package com.example.ila.api.models;

import java.math.BigDecimal;
import java.sql.Date;

public class InvoiceSupplier {
	private int id;
	private int idSupplier;
	private BigDecimal price;
	private Date createDate;
	private int idInvoice;
	private int status;
	private int sttInvoice;
	
	public InvoiceSupplier(int id, int idSupplier, BigDecimal price, Date createDate, int idInvoice, int status,
			int sttInvoice) {
		super();
		this.id = id;
		this.idSupplier = idSupplier;
		this.price = price;
		this.createDate = createDate;
		this.idInvoice = idInvoice;
		this.status = status;
		this.sttInvoice = sttInvoice;
	}
	public int getSttInvoice() {
		return sttInvoice;
	}
	public void setSttInvoice(int sttInvoice) {
		this.sttInvoice = sttInvoice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
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
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	public InvoiceSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
