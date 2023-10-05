package com.example.ila.api.models;

public class InvoiceDetails {
	private int id;
	private int idInvoice;
	private int idCart;
	private int isStatus;
	
	public InvoiceDetails(int isStatus) {
		super();
		this.isStatus = isStatus;
	}
	public int getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(int isStatus) {
		this.isStatus = isStatus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	public int getIdCart() {
		return idCart;
	}
	public void setIdCart(int idCart) {
		this.idCart = idCart;
	}
	public InvoiceDetails(int id, int idInvoice, int idCart) {
		super();
		this.id = id;
		this.idInvoice = idInvoice;
		this.idCart = idCart;
	}
	public InvoiceDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
