package com.example.ila.api.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.example.ila.api.ModelView.CommentBlogView;
import com.example.ila.api.ModelView.DiscountView;
import com.example.ila.api.ModelView.InvoiceView;
import com.example.ila.api.ModelView.ProductView;
import com.example.ila.api.ModelView.ReviewView;
import com.example.ila.api.dao.AdminDao_Login;
import com.example.ila.api.dao.AdminDao_SelectAcc;
import com.example.ila.api.dao.SupplierDao_Blog;
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
import com.example.ila.api.models.Voucher;

public class ILA_API_Repository {
private static  ILA_API_Repository instance = null;
	
	public static ILA_API_Repository getInstance() {
		if (instance ==null) {
			instance = new ILA_API_Repository();
		}
		return instance;
	}
	
	
	
	//ADMIN
	
	public Admin AdminLogin(Admin adm) {
		return AdminDao_Login.getInstance().Login(adm);
	}
	
	public List<Account> getAll() {
		return AdminDao_SelectAcc.getInstance().GetAll();
	}
	
	
	
	//SUPPLIER
	//INVOICE
	public List<InvoiceView> GetInvoiceOfSupp(int idSupplier){
		return SupplierDao_Invoice.getInstance().GetInvoiceOfSupp(idSupplier) ;
	}
	public List<InvoiceView> getInvoiceDetails(int idInvoice){
		return SupplierDao_Invoice.getInstance().getInvoiceDetails(idInvoice);
	}
	
	public void ConfirmInvoiceOfSupp(int id , int isStatus) {
		SupplierDao_Invoice.getInstance().ConfirmInvoiceOfSupp(id, isStatus);
	}
	
	public List<InvoiceView> SearchFilterInvoice(int idSupplier, int isStatus){
		return SupplierDao_Invoice.getInstance().SearchFilterInvoice(idSupplier,isStatus);
	}
	
	public List<BigDecimal> getSupplier_Revenue_AllMonth(){
		List<BigDecimal> iv = new ArrayList<>();
		for (int i = 1; i < 13; i++) {
			iv.add(SupplierDao_Invoice.getInstance().getSupplier_Revenue_AllMonth(i).getTotalS());
		}
		return iv; 
	}
	
	public List<BigDecimal> getSupplier_Revenue_AllDay(int month){
		List<BigDecimal> iv = new ArrayList<>();
		for (int i = 1; i < 32; i++) {
			iv.add(SupplierDao_Invoice.getInstance().getSupplier_Revenue_AllDay(i, month).getTotalS());
		}
		return iv; 
	}
	
	
	//category
	
	public List<Category> getAllCate(){
		return SupplierDao_Product.getInstance().getAllCate();
	}
	
	//product
	public List<ProductView> GetAllProdSupp(int idSupplier) {
		return SupplierDao_Product.getInstance().GetAllProdSupp(idSupplier) ;
	}
	
	public List<ProductView>SearchFilterActive(int isActive){
		return SupplierDao_Product.getInstance().SearchFilterActive(isActive);
	}
	
	public boolean Insert(ProductView modelInsert) {
		return SupplierDao_Product.getInstance().Insert(modelInsert);
	}
	
	public boolean Update(ProductView modelUpdate) {
		return SupplierDao_Product.getInstance().Update(modelUpdate);
	}
	
	public List<ProductView> SearchFilterHighToLow(){
		return SupplierDao_Product.getInstance().SearchFilterHighToLow();
	}
	
	public List<ProductView> SearchFilterLowToHigh(){
		return SupplierDao_Product.getInstance().SearchFilterLowToHigh();
	}
	
	public List<ProductView> SearchFilterDiscount(){
		return SupplierDao_Product.getInstance().SearchFilterDiscount();
	}
	
	//Voucher
	public boolean Insert(Voucher modelInsert) {
		return SupplierDao_Voucher.getInstance().Insert(modelInsert);
	}
	
	public boolean Update(Voucher modelUpdate) {
		return SupplierDao_Voucher.getInstance().Update(modelUpdate);
	}
	
	public List<Voucher> GetAllVoucher(String usercreate){
		return SupplierDao_Voucher.getInstance().GetAllVoucher(usercreate);
	}
	
	public List<Voucher> Supplier_FilterVoucher1(String usercreate){
		return SupplierDao_Voucher.getInstance().Supplier_FilterVoucher1(usercreate);
	}
	
	public List<Voucher> Supplier_FilterVoucher2(String usercreate){
		return SupplierDao_Voucher.getInstance().Supplier_FilterVoucher2(usercreate);
	}
	
	public List<Voucher> Supplier_FilterVoucher3(String usercreate){
		return SupplierDao_Voucher.getInstance().Supplier_FilterVoucher3(usercreate);
	}
	
	
	//Discount
	
	public boolean Insert(DiscountView modelInsert) {
		return SupplierDao_Discount.getInstance().Insert(modelInsert);
	}
	
	public boolean Update(DiscountView modelUpdate) {
		return SupplierDao_Discount.getInstance().Update(modelUpdate);
	}
	
	public List<DiscountView> GetAll() {
		return SupplierDao_Discount.getInstance().GetAll();
	}
	
	public List<DiscountView> Supplier_FilterDiscount1(int idSupplier){
		return SupplierDao_Discount.getInstance().Supplier_FilterDiscount1(idSupplier); 
	}
	
	
	public List<DiscountView> Supplier_FilterDiscount2(int idSupplier){
		return SupplierDao_Discount.getInstance().Supplier_FilterDiscount2(idSupplier); 
	}
	
	public List<DiscountView> Supplier_FilterDiscount3(int idSupplier){
		return SupplierDao_Discount.getInstance().Supplier_FilterDiscount3(idSupplier); 
	}
	
	
	//Blog
	
	public boolean Insert(Blog modelInsert) {
		return SupplierDao_Blog.getInstance().Insert(modelInsert);
	}
	
	public boolean Update(Blog modelUpdate) {
		return SupplierDao_Blog.getInstance().Update(modelUpdate);
	}
	
	public List<Blog> GetAllBlog( int userCreate){
		return SupplierDao_Blog.getInstance().GetAllBlog(userCreate);
	}
	
	public Blog DetailBlog (int id){
		return SupplierDao_Blog.getInstance().DetailBlog(id);
	}
	
	//Comment Blog
	
	public boolean Update(CommentBlogView modelUpdate) {
		return SupplierDao_CommentBlog.getInstance().Update(modelUpdate);
	}
	
	public List<CommentBlogView> getCommentBlogDetail ( int idBlog){
		return SupplierDao_CommentBlog.getInstance().getCommentBlogDetail(idBlog);
	}
	
	public CommentBlogView GetDataCMT(int id) {
		return SupplierDao_CommentBlog.getInstance().GetDataCMT(id);
	}
	
	
	//Review
	public ReviewView getDataReview(int idProduct) {
		return SupplierDao_Review.getInstance().getDataReview(idProduct);
	}
	
	public List<ReviewView> getDetailReview(int idProduct){
		return SupplierDao_Review.getInstance().getDetailReview(idProduct);
	}
	
	public List<ReviewView> SearchFilterReview(int idProduct, int review){
		return SupplierDao_Review.getInstance().SearchFilterReview(idProduct, review); 
	}
	
	
}
