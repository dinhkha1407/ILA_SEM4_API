package com.example.ila.api.ModelView;

import java.math.BigDecimal;
import java.sql.Date;

public class InvoiceView {
	//get tung hoa don
	private int id;
	private String nameCus;
	private String VoucherA;
	private String VoucherS;
	private BigDecimal TotalPrice;
	private Date createDate;
	private int isStatus;
	
	//get chi tiet
	private String nameProduct;
	private BigDecimal unitPrice;
	private BigDecimal Amount;
	private BigDecimal Price;
	
	// chart
	private int idInvoice;
	private BigDecimal priceVoucherA;
	private BigDecimal amountReceived;
	private BigDecimal totalA;
	private BigDecimal totalS;
	 
	
	
	//NEW - 30/9/2023
	private BigDecimal priceOrder;
	private int idInvoiceDetail;
	private String address;
	private BigDecimal TotalOrderAmount;
	private BigDecimal TotalAmountOfProduct;
	private BigDecimal RefundtoCustomers;
	private int idSupplier;
	
	public InvoiceView(int id, String nameCus, String voucherA, String voucherS, BigDecimal totalPrice, Date createDate,
			int isStatus, String nameProduct, BigDecimal unitPrice, BigDecimal amount, BigDecimal price, int idInvoice,
			BigDecimal priceVoucherA, BigDecimal amountReceived, BigDecimal totalA, BigDecimal totalS,
			BigDecimal priceOrder, int idInvoiceDetail, String address, BigDecimal totalOrderAmount,
			BigDecimal totalAmountOfProduct, BigDecimal refundtoCustomers, int idSupplier) {
		super();
		this.id = id;
		this.nameCus = nameCus;
		VoucherA = voucherA;
		VoucherS = voucherS;
		TotalPrice = totalPrice;
		this.createDate = createDate;
		this.isStatus = isStatus;
		this.nameProduct = nameProduct;
		this.unitPrice = unitPrice;
		Amount = amount;
		Price = price;
		this.idInvoice = idInvoice;
		this.priceVoucherA = priceVoucherA;
		this.amountReceived = amountReceived;
		this.totalA = totalA;
		this.totalS = totalS;
		this.priceOrder = priceOrder;
		this.idInvoiceDetail = idInvoiceDetail;
		this.address = address;
		TotalOrderAmount = totalOrderAmount;
		TotalAmountOfProduct = totalAmountOfProduct;
		RefundtoCustomers = refundtoCustomers;
		this.idSupplier = idSupplier;
	}
	public int getIdSupplier() {
		return idSupplier;
	}
	public void setIdSupplier(int idSupplier) {
		this.idSupplier = idSupplier;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNameCus() {
		return nameCus;
	}
	public void setNameCus(String nameCus) {
		this.nameCus = nameCus;
	}
	public String getVoucherA() {
		return VoucherA;
	}
	public void setVoucherA(String voucherA) {
		VoucherA = voucherA;
	}
	public String getVoucherS() {
		return VoucherS;
	}
	public void setVoucherS(String voucherS) {
		VoucherS = voucherS;
	}
	public BigDecimal getTotalPrice() {
		return TotalPrice;
	}
	public void setTotalPrice(BigDecimal totalPrice) {
		TotalPrice = totalPrice;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getIsStatus() {
		return isStatus;
	}
	public void setIsStatus(int isStatus) {
		this.isStatus = isStatus;
	}
	public String getNameProduct() {
		return nameProduct;
	}
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public BigDecimal getAmount() {
		return Amount;
	}
	public void setAmount(BigDecimal amount) {
		Amount = amount;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
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
	public BigDecimal getPriceOrder() {
		return priceOrder;
	}
	public void setPriceOrder(BigDecimal priceOrder) {
		this.priceOrder = priceOrder;
	}
	public int getIdInvoiceDetail() {
		return idInvoiceDetail;
	}
	public void setIdInvoiceDetail(int idInvoiceDetail) {
		this.idInvoiceDetail = idInvoiceDetail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public BigDecimal getTotalOrderAmount() {
		return TotalOrderAmount;
	}
	public void setTotalOrderAmount(BigDecimal totalOrderAmount) {
		TotalOrderAmount = totalOrderAmount;
	}
	public BigDecimal getTotalAmountOfProduct() {
		return TotalAmountOfProduct;
	}
	public void setTotalAmountOfProduct(BigDecimal totalAmountOfProduct) {
		TotalAmountOfProduct = totalAmountOfProduct;
	}
	public BigDecimal getRefundtoCustomers() {
		return RefundtoCustomers;
	}
	public void setRefundtoCustomers(BigDecimal refundtoCustomers) {
		RefundtoCustomers = refundtoCustomers;
	}
	
	public InvoiceView() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
