package com.example.ila.api.models;

public class InvoiceDetails {
	private int id;
	private int idInvoice;
	private int idCart;
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
