package com.example.ila.api.ModelView;

import java.math.BigDecimal;
import java.sql.Date;

public class DiscountView {
	
	private int id;
	private BigDecimal discount;
	private Date dateBegin;
	private Date dateEnd;
	private int idProduct;
	private int isStatus;
	
	//product
	private String title;
	private BigDecimal price;
	private BigDecimal SalePrice;
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
	public int getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(int isStatus) {
		this.isStatus = isStatus;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public BigDecimal getSalePrice() {
		return SalePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		SalePrice = salePrice;
	}
	public DiscountView(int id, BigDecimal discount, Date dateBegin, Date dateEnd, int idProduct, int isStatus,
			String title, BigDecimal price, BigDecimal salePrice) {
		super();
		this.id = id;
		this.discount = discount;
		this.dateBegin = dateBegin;
		this.dateEnd = dateEnd;
		this.idProduct = idProduct;
		this.isStatus = isStatus;
		this.title = title;
		this.price = price;
		SalePrice = salePrice;
	}
	public DiscountView() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
