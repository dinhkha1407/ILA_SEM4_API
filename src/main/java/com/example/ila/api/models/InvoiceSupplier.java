package com.example.ila.api.models;

import java.math.BigDecimal;

public class InvoiceSupplier {
	private int id;
	private int idInvoice;
	private BigDecimal priceVoucherA;
	private BigDecimal amountReceived;
	private BigDecimal totalA;
	private BigDecimal totalS;
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
	public BigDecimal getPriceVoucherA() {
		return priceVoucherA;
	}
	public void setPriceVoucherA(BigDecimal priceVoucherA) {
		this.priceVoucherA = priceVoucherA;
	}
	public BigDecimal getAmountReceived() {
		return amountReceived;
	}
	public void setAmountReceived(BigDecimal amountReceived) {
		this.amountReceived = amountReceived;
	}
	public BigDecimal getTotalA() {
		return totalA;
	}
	public void setTotalA(BigDecimal totalA) {
		this.totalA = totalA;
	}
	public BigDecimal getTotalS() {
		return totalS;
	}
	public void setTotalS(BigDecimal totalS) {
		this.totalS = totalS;
	}
	public InvoiceSupplier(int id, int idInvoice, BigDecimal priceVoucherA, BigDecimal amountReceived,
			BigDecimal totalA, BigDecimal totalS) {
		super();
		this.id = id;
		this.idInvoice = idInvoice;
		this.priceVoucherA = priceVoucherA;
		this.amountReceived = amountReceived;
		this.totalA = totalA;
		this.totalS = totalS;
	}
	public InvoiceSupplier() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
