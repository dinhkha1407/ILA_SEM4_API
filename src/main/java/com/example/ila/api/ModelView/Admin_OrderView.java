package com.example.ila.api.ModelView;

import java.math.BigDecimal;
import java.sql.Date;

public class Admin_OrderView {
	private int id;
	private Date createDate;
	private BigDecimal condition;
	private int discount;
	private BigDecimal totalPrice;
	private BigDecimal totalA;
	private Boolean status;
	
	private int amountSupp;
	
	private int idInvoice;
	private int idSupp;
	private String titleSupp;
	private BigDecimal priceSupp;
	private Float discountVoucherA;
	private Float totalSupp;
	private int statusSupp;
	public Admin_OrderView() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Admin_OrderView(int id, Date createDate, BigDecimal condition, int discount, BigDecimal totalPrice,
			BigDecimal totalA, Boolean status, int amountSupp, int idInvoice, int idSupp, String titleSupp,
			BigDecimal priceSupp, Float discountVoucherA, Float totalSupp, int statusSupp) {
		super();
		this.id = id;
		this.createDate = createDate;
		this.condition = condition;
		this.discount = discount;
		this.totalPrice = totalPrice;
		this.totalA = totalA;
		this.status = status;
		this.amountSupp = amountSupp;
		this.idInvoice = idInvoice;
		this.idSupp = idSupp;
		this.titleSupp = titleSupp;
		this.priceSupp = priceSupp;
		this.discountVoucherA = discountVoucherA;
		this.totalSupp = totalSupp;
		this.statusSupp = statusSupp;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public BigDecimal getCondition() {
		return condition;
	}
	public void setCondition(BigDecimal condition) {
		this.condition = condition;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public BigDecimal getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	public BigDecimal getTotalA() {
		return totalA;
	}
	public void setTotalA(BigDecimal totalA) {
		this.totalA = totalA;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public int getAmountSupp() {
		return amountSupp;
	}
	public void setAmountSupp(int amountSupp) {
		this.amountSupp = amountSupp;
	}
	public int getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	public int getIdSupp() {
		return idSupp;
	}
	public void setIdSupp(int idSupp) {
		this.idSupp = idSupp;
	}
	public String getTitleSupp() {
		return titleSupp;
	}
	public void setTitleSupp(String titleSupp) {
		this.titleSupp = titleSupp;
	}
	public BigDecimal getPriceSupp() {
		return priceSupp;
	}
	public void setPriceSupp(BigDecimal priceSupp) {
		this.priceSupp = priceSupp;
	}
	public Float getDiscountVoucherA() {
		return discountVoucherA;
	}
	public void setDiscountVoucherA(Float discountVoucherA) {
		this.discountVoucherA = discountVoucherA;
	}
	public Float getTotalSupp() {
		return totalSupp;
	}
	public void setTotalSupp(Float totalSupp) {
		this.totalSupp = totalSupp;
	}


	public int getStatusSupp() {
		return statusSupp;
	}


	public void setStatusSupp(int statusSupp) {
		this.statusSupp = statusSupp;
	}
	
	
}
