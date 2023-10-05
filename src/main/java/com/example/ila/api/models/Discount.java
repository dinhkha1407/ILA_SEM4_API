package com.example.ila.api.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Discount {
	private int id;
	private BigDecimal discount;
	private Date dateBegin;
	private Date dateEnd;
	private int idProduct;
	private BigDecimal priceSale;
	private int isStatus;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public Date getDateBegin() {
		return dateBegin;
	}
	public void setDateBegin(Date dateBegin) {
		this.dateBegin = dateBegin;
	}
	public Date getDateEnd() {
		return dateEnd;
	}
	public void setDateEnd(Date dateEnd) {
		this.dateEnd = dateEnd;
	}
	public int getIdProduct() {
		return idProduct;
	}
	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}
	public BigDecimal getPriceSale() {
		return priceSale;
	}
	public void setPriceSale(BigDecimal priceSale) {
		this.priceSale = priceSale;
	}
	public int getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(int isStatus) {
		this.isStatus = isStatus;
	}
	public Discount(int id, BigDecimal discount, Date dateBegin, Date dateEnd, int idProduct, BigDecimal priceSale,
			int isStatus) {
		super();
		this.id = id;
		this.discount = discount;
		this.dateBegin = dateBegin;
		this.dateEnd = dateEnd;
		this.idProduct = idProduct;
		this.priceSale = priceSale;
		this.isStatus = isStatus;
	}
	public Discount() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
