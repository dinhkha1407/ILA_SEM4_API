package com.example.ila.api.models;

import java.math.BigDecimal;
import java.sql.Date;

public class Voucher {
	private String id;
	private String coupon;
	private BigDecimal condition;
	private int discount;
	private String usercreate;
	private Date startDate;
	private Date endDate;
	private boolean isActive;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
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
	public String getUsercreate() {
		return usercreate;
	}
	public void setUsercreate(String usercreate) {
		this.usercreate = usercreate;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Voucher(String id, String coupon, BigDecimal condition, int discount, String usercreate, Date startDate,
			Date endDate, boolean isActive) {
		super();
		this.id = id;
		this.coupon = coupon;
		this.condition = condition;
		this.discount = discount;
		this.usercreate = usercreate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isActive = isActive;
	}
	public Voucher() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
