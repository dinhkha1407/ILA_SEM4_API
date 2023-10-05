package com.example.ila.api.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.ila.api.ModelView.CommentBlogView;
import com.example.ila.api.ModelView.DiscountView;
import com.example.ila.api.ModelView.InvoiceSupplierView;
import com.example.ila.api.ModelView.InvoiceView;
import com.example.ila.api.ModelView.ProductView;
import com.example.ila.api.ModelView.ReviewView;
import com.example.ila.api.dao.AdminDao_Login;
import com.example.ila.api.dao.AdminDao_Product;
import com.example.ila.api.dao.AdminDao_Supplier;
import com.example.ila.api.dao.AdminDao_Voucher;
import com.example.ila.api.dao.AdminDao_Account;
import com.example.ila.api.dao.AdminDao_Blog;
import com.example.ila.api.dao.AdminDao_Category;
import com.example.ila.api.dao.AdminDao_Invoice;
import com.example.ila.api.dao.SupplierDao_Blog;
import com.example.ila.api.dao.SupplierDao_Cart;
import com.example.ila.api.dao.SupplierDao_CommentBlog;
import com.example.ila.api.dao.SupplierDao_Discount;
import com.example.ila.api.dao.SupplierDao_Invoice;
import com.example.ila.api.dao.SupplierDao_Product;
import com.example.ila.api.dao.SupplierDao_Review;
import com.example.ila.api.dao.SupplierDao_Voucher;
import com.example.ila.api.models.Account;
import com.example.ila.api.models.Admin;
import com.example.ila.api.models.Blog;
import com.example.ila.api.models.Category;
import com.example.ila.api.models.Invoice;
import com.example.ila.api.models.InvoiceDetails;
import com.example.ila.api.models.InvoiceSupplier;
import com.example.ila.api.models.Product;
import com.example.ila.api.models.Supplier;
import com.example.ila.api.models.Voucher;

public class ILA_API_Repository {
	private static ILA_API_Repository instance = null;

	public static ILA_API_Repository getInstance() {
		if (instance == null) {
			instance = new ILA_API_Repository();
		}
		return instance;
	}

	// ADMIN
	// Login
	public Admin AdminLogin(Admin adm) {
		return AdminDao_Login.getInstance().Login(adm);
	}

	public boolean Update(Admin modelUpdate) {
		return AdminDao_Login.getInstance().Update(modelUpdate);
	}

	public Admin Admin_CheckEmailPwd(String email) {
		return AdminDao_Login.getInstance().Admin_CheckEmailPwd(email);
	}

	// Account User
	public List<Account> getAll() {
		return AdminDao_Account.getInstance().GetAll();
	}

	public boolean Update(Account modelUpdate) {
		return AdminDao_Account.getInstance().Update(modelUpdate);
	}

	// Account Supplier
	public List<Supplier> getAllSupplier() {
		return AdminDao_Supplier.getInstance().GetAll();
	}

	public boolean Update(Supplier modelUpdate) {
		return AdminDao_Supplier.getInstance().Update(modelUpdate);
	}

	public List<Supplier> FilterSupp(int isActive) {
		return AdminDao_Supplier.getInstance().FilterSupp(isActive);
	}

	// Qly Product cua supp
	public boolean UpdateActiveProd(ProductView modelUpdate) {
		return AdminDao_Product.getInstance().Update(modelUpdate);
	}

	public List<ProductView> GetAllProdOfSup() {
		return AdminDao_Product.getInstance().GetAll();
	}

	public List<ProductView> Admin_FilterActiveProdOfSup(int isActive, int idSupplier) {
		return AdminDao_Product.getInstance().Admin_FilterActiveProdOfSup(isActive, idSupplier);
	}

	public List<ProductView> Admin_FilterActiveProd(int isActive) {
		return AdminDao_Product.getInstance().Admin_FilterActiveProd(isActive);
	}

	public List<ProductView> Admin_FilterProdSupp(int idSupplier) {
		return AdminDao_Product.getInstance().Admin_FilterProdSupp(idSupplier);
	}

	// Qly cate Admin

	public boolean Insert(Category modelInsert) {
		return AdminDao_Category.getInstance().Insert(modelInsert);
	}

	public List<Category> GetAllCate() {
		return AdminDao_Category.getInstance().GetAll();
	}

	public boolean Update(Category modelUpdate) {
		return AdminDao_Category.getInstance().Update(modelUpdate);
	}

	public Category GetByIdCate(int id) {
		return AdminDao_Category.getInstance().GetByIdCate(id);
	}

	public boolean UpdateActive(Category modelUpdate) {
		return AdminDao_Category.getInstance().UpdateActive(modelUpdate);
	}

	public List<Category> Admin_FilterCategory(int isActive) {
		return AdminDao_Category.getInstance().Admin_FilterCategory(isActive);
	}

	// QlyBlog

	public boolean InsertBlogAdmin(Blog modelInsert) {
		return AdminDao_Blog.getInstance().Insert(modelInsert);
	}

	public List<Blog> Admin_SelectBlog() {
		return AdminDao_Blog.getInstance().Admin_SelectBlog();
	}

	public Blog Admin_SelectDetailBlog(int id) {
		return AdminDao_Blog.getInstance().Admin_SelectDetailBlog(id);
	}

	public Blog Admin_GetByIdBlog(int id) {
		return AdminDao_Blog.getInstance().Admin_GetByIdBlog(id);
	}

	public boolean UpdateBlogAdmin(Blog modelUpdate) {
		return AdminDao_Blog.getInstance().Update(modelUpdate);
	}

	public List<Blog> Admin_FilterBlog(int isStatus) {
		return AdminDao_Blog.getInstance().Admin_FilterBlog(isStatus);
	}

	public List<Blog> Admin_SelectBlogOfSupp() {
		return AdminDao_Blog.getInstance().Admin_SelectBlogOfSupp();
	}

	public Blog Admin_BlogDetailsOfSup(int id) {
		return AdminDao_Blog.getInstance().Admin_BlogDetailsOfSup(id);
	}

	public boolean Admin_UpdateBlogDetailOfSup(Blog ModelUpdate) {
		return AdminDao_Blog.getInstance().Admin_UpdateBlogDetailOfSup(ModelUpdate);
	}

	public List<CommentBlogView> Admin_getCommentMain(int idBlog) {
		return AdminDao_Blog.getInstance().Admin_getCommentMain(idBlog);

	}

	public List<CommentBlogView> Admin_getCommentSub(int idBlog) {
		return AdminDao_Blog.getInstance().Admin_getCommentSub(idBlog);

	}

	// Voucher

	public boolean InsertVoucherAdmin(Voucher modelInsert) {
		return AdminDao_Voucher.getInstance().Insert(modelInsert);
	}

	public Voucher Admin_CheckVoucherExist(int id) {
		return AdminDao_Voucher.getInstance().Admin_CheckVoucherExist(id);
	}

	public List<Voucher> GetAllVoucherAdmin() {
		return AdminDao_Voucher.getInstance().GetAll();
	}

	public List<Voucher> Admin_FilterVoucher1() {
		return AdminDao_Voucher.getInstance().Admin_FilterVoucher1();
	}

	public List<Voucher> Admin_FilterVoucher2() {
		return AdminDao_Voucher.getInstance().Admin_FilterVoucher2();
	}

	public List<Voucher> Admin_FilterVoucher3() {
		return AdminDao_Voucher.getInstance().Admin_FilterVoucher3();
	}

	public Voucher Admin_GetIDVoucher(int id) {
		return AdminDao_Voucher.getInstance().Admin_GetIDVoucher(id);
	}

	public boolean UpdateVoucherAdmin(Voucher modelUpdate) {
		return AdminDao_Voucher.getInstance().Update(modelUpdate);
	}

	public boolean Delete(Voucher modelDelete) {
		return AdminDao_Voucher.getInstance().Delete(modelDelete);
	}

	// chart
	public List<InvoiceSupplierView> Admin_Chart30Days(int month) {
		return AdminDao_Invoice.getInstance().Admin_Chart30Days(month);
	}

	public List<InvoiceSupplierView> Admin_Chart12Months(int year) {
		return AdminDao_Invoice.getInstance().Admin_Chart12Months(year);
	}

	public List<InvoiceSupplierView> Admin_Total30Days(int month) {
		return AdminDao_Invoice.getInstance().Admin_Total30Days(month);
	}

	public List<InvoiceSupplierView> Admin_Total12Months(int year) {
		return AdminDao_Invoice.getInstance().Admin_Total12Months(year);
	}

	public List<InvoiceSupplierView> Admin_Chart30DaysYear(int month, int year) {
		return AdminDao_Invoice.getInstance().Admin_Chart30DaysYear(month, year);
	}

	public List<InvoiceSupplierView> Admin_Total30DaysYear(int month, int year) {
		return AdminDao_Invoice.getInstance().Admin_Total30DaysYear(month, year);
	}

	// SUPPLIER
	// INVOICE
	public List<InvoiceView> GetInvoiceOfSupp(int idSupplier) {
		return SupplierDao_Invoice.getInstance().GetInvoiceOfSupp(idSupplier);
	}

	public List<InvoiceView> getInvoiceDetails(int idInvoice) {
		return SupplierDao_Invoice.getInstance().getInvoiceDetails(idInvoice);
	}

	public void ConfirmInvoiceOfSupp(int id, int isStatus) {
		SupplierDao_Invoice.getInstance().ConfirmInvoiceOfSupp(id, isStatus);
	}

	public List<InvoiceView> SearchFilterInvoice(int idSupplier, int isStatus) {
		return SupplierDao_Invoice.getInstance().SearchFilterInvoice(idSupplier, isStatus);
	}

	public List<BigDecimal> getSupplier_Revenue_AllMonth() {
		List<BigDecimal> iv = new ArrayList<>();
		for (int i = 1; i < 13; i++) {
			iv.add(SupplierDao_Invoice.getInstance().getSupplier_Revenue_AllMonth(i).getTotalS());
		}
		return iv;
	}

	public List<BigDecimal> getSupplier_Revenue_AllDay(int month) {
		List<BigDecimal> iv = new ArrayList<>();
		for (int i = 1; i < 32; i++) {
			iv.add(SupplierDao_Invoice.getInstance().getSupplier_Revenue_AllDay(i, month).getTotalS());
		}
		return iv;
	}

	// category

	public List<Category> getAllCate() {
		return SupplierDao_Product.getInstance().getAllCate();
	}

	// product

	public int CountFilterActive(int idSupplier, int isActive) {
		return SupplierDao_Product.getInstance().CountFilterActive(idSupplier, isActive);
	}

	public int Supplier_WatchList(int idProduct) {
		return SupplierDao_Product.getInstance().Supplier_WatchList(idProduct);
	}

	public List<ProductView> GetAllProdSupp(int idSupplier) {
		return SupplierDao_Product.getInstance().GetAllProdSupp(idSupplier);
	}

	public List<ProductView> SearchFilterActive(int isActive, int idSupplier) {
		return SupplierDao_Product.getInstance().SearchFilterActive(isActive, idSupplier);
	}

	public boolean Insert(ProductView modelInsert) {
		return SupplierDao_Product.getInstance().Insert(modelInsert);
	}

	public boolean Update(ProductView modelUpdate) {
		return SupplierDao_Product.getInstance().Update(modelUpdate);
	}

	public List<ProductView> SearchFilterHighToLow() {
		return SupplierDao_Product.getInstance().SearchFilterHighToLow();
	}

	public List<ProductView> SearchFilterLowToHigh() {
		return SupplierDao_Product.getInstance().SearchFilterLowToHigh();
	}

	public List<ProductView> SearchFilterDiscount() {
		return SupplierDao_Product.getInstance().SearchFilterDiscount();
	}

	// Voucher
	public boolean Insert(Voucher modelInsert) {
		return SupplierDao_Voucher.getInstance().Insert(modelInsert);
	}

	public boolean Update(Voucher modelUpdate) {
		return SupplierDao_Voucher.getInstance().Update(modelUpdate);
	}

	public List<Voucher> GetAllVoucher(String usercreate) {
		return SupplierDao_Voucher.getInstance().GetAllVoucher(usercreate);
	}

	public List<Voucher> Supplier_FilterVoucher1(String usercreate) {
		return SupplierDao_Voucher.getInstance().Supplier_FilterVoucher1(usercreate);
	}

	public List<Voucher> Supplier_FilterVoucher2(String usercreate) {
		return SupplierDao_Voucher.getInstance().Supplier_FilterVoucher2(usercreate);
	}

	public List<Voucher> Supplier_FilterVoucher3(String usercreate) {
		return SupplierDao_Voucher.getInstance().Supplier_FilterVoucher3(usercreate);
	}

	// Discount

	public boolean Insert(DiscountView modelInsert) {
		return SupplierDao_Discount.getInstance().Insert(modelInsert);
	}

	public boolean Update(DiscountView modelUpdate) {
		return SupplierDao_Discount.getInstance().Update(modelUpdate);
	}

	public List<DiscountView> GetAll() {
		return SupplierDao_Discount.getInstance().GetAll();
	}

	public List<DiscountView> Supplier_FilterDiscount1(int idSupplier) {
		return SupplierDao_Discount.getInstance().Supplier_FilterDiscount1(idSupplier);
	}

	public List<DiscountView> Supplier_FilterDiscount2(int idSupplier) {
		return SupplierDao_Discount.getInstance().Supplier_FilterDiscount2(idSupplier);
	}

	public List<DiscountView> Supplier_FilterDiscount3(int idSupplier) {
		return SupplierDao_Discount.getInstance().Supplier_FilterDiscount3(idSupplier);
	}

	// Blog

	public boolean Insert(Blog modelInsert) {
		return SupplierDao_Blog.getInstance().Insert(modelInsert);
	}

	public boolean Update(Blog modelUpdate) {
		return SupplierDao_Blog.getInstance().Update(modelUpdate);
	}

	public List<Blog> GetAllBlog(int userCreate) {
		return SupplierDao_Blog.getInstance().GetAllBlog(userCreate);
	}

	public Blog DetailBlog(int id) {
		return SupplierDao_Blog.getInstance().DetailBlog(id);
	}

	public List<Blog> GetFilterBlog(int userCreate, int isStatus) {
		return SupplierDao_Blog.getInstance().GetFilterBlog(userCreate, isStatus);
	}

	// Comment Blog

	public boolean Update(CommentBlogView modelUpdate) {
		return SupplierDao_CommentBlog.getInstance().Update(modelUpdate);
	}

	public List<CommentBlogView> getCommentBlogDetail(int idBlog) {
		return SupplierDao_CommentBlog.getInstance().getCommentBlogDetail(idBlog);
	}

	public CommentBlogView GetDataCMT(int id) {
		return SupplierDao_CommentBlog.getInstance().GetDataCMT(id);
	}

	// Review
	public ReviewView getDataReview(int idProduct) {
		return SupplierDao_Review.getInstance().getDataReview(idProduct);
	}

	public List<ReviewView> getDetailReview(int idProduct) {
		return SupplierDao_Review.getInstance().getDetailReview(idProduct);
	}

	public List<ReviewView> SearchFilterReview(int idProduct, int review) {
		return SupplierDao_Review.getInstance().SearchFilterReview(idProduct, review);
	}

	public int Supplier_CountReview(int idProduct) {
		return SupplierDao_Review.getInstance().Supplier_CountReview(idProduct);
	}

	public int Supplier_CountFilterReview(int idProduct, int review) {
		return SupplierDao_Review.getInstance().Supplier_CountFilterReview(idProduct, review);
	}

	// Cart
	public int Supplier_CountCart() {
		return SupplierDao_Cart.getInstance().Supplier_CountCart();
	}
	
	
	
	
	//NEW ORDER DETAIL SUPPLIER 30/9/2023
	public List<InvoiceView> Supplier_detailOrders () {
		return SupplierDao_Invoice.getInstance().Supplier_detailOrders();
	}
	
	public boolean Supplier_ConfirmInvDetail(InvoiceDetails modelUpdate) {
		return SupplierDao_Invoice.getInstance().Supplier_ConfirmInvDetail(modelUpdate);
	}
	
	public boolean Supplier_ConfirmInv(Invoice modelUpdate) {
		return SupplierDao_Invoice.getInstance().Supplier_ConfirmInv(modelUpdate);
	}
	
	//NEW ORDER SUPPLIER 30/9/2023
	
	public List<InvoiceView> Supplier_GetNameAddDate(int id){
		return SupplierDao_Invoice.getInstance().Supplier_GetNameAddDate(id);
	}
	
	public InvoiceView getSupplier_GetTotalOrderAmount(int idSupplier){
		return SupplierDao_Invoice.getInstance().getSupplier_GetTotalOrderAmount(idSupplier);
	}
	
	public InvoiceView Supplier_GetTotalAmountOfProduct(int idSupplier){
		return SupplierDao_Invoice.getInstance().Supplier_GetTotalAmountOfProduct(idSupplier);
	}
	
	public InvoiceView Supplier_GetRefundtoCustomers(int idSupplier){
		return SupplierDao_Invoice.getInstance().Supplier_GetRefundtoCustomers(idSupplier);
	}
	
	public InvoiceSupplier Supplier_GetMoneyReceived(int idSupplier){
		return SupplierDao_Invoice.getInstance().Supplier_GetMoneyReceived(idSupplier);
	}
	
	public boolean Supplier_GetXacNhanDaNhanTienSupp(InvoiceSupplier modelUpdate) {
		return SupplierDao_Invoice.getInstance().Supplier_GetXacNhanDaNhanTienSupp(modelUpdate);
	}
	
	public InvoiceSupplier Supplier_ActionOrder(int isStatus,int status) {
		return SupplierDao_Invoice.getInstance().Supplier_ActionOrder(isStatus, status);
	}
	
	public Voucher Supplier_GetPriceVoucher (int id, String usercreate) {
		return SupplierDao_Invoice.getInstance().Supplier_GetPriceVoucher(id, usercreate);
	}
	
	


	
	
	

}
