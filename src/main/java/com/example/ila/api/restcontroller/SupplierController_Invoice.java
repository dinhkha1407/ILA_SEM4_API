package com.example.ila.api.restcontroller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.InvoiceView;
import com.example.ila.api.models.Invoice;
import com.example.ila.api.models.InvoiceDetails;
import com.example.ila.api.models.InvoiceSupplier;
import com.example.ila.api.models.Voucher;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_Invoice {
	
	@GetMapping("/Invoice")
	public List<InvoiceView> getAllInvoice(int idSupplier){
		return ILA_API_Repository.getInstance().GetInvoiceOfSupp(idSupplier);
	}
	
	@GetMapping("/InvoiceDetail")
	public List<InvoiceView> getInvoiceDetais(int idInvoice){
		return ILA_API_Repository.getInstance().getInvoiceDetails(idInvoice);
	}
	
	@GetMapping("/SearchFilterInvoice")
	public List<InvoiceView> SearchFilterInvoice(int idSupplier, int isStatus){
		return ILA_API_Repository.getInstance().SearchFilterInvoice(idSupplier,isStatus);
	}
	
	@PostMapping("/ConfirmInvoice")
	public void ConfirmInvoice(@RequestBody int id , int isStatus) {
		ILA_API_Repository.getInstance().ConfirmInvoiceOfSupp(id, isStatus);
	}
	
	@GetMapping("/getSupplier_Revenue_AllMonth")
	public List<BigDecimal> getSupplier_Revenue_AllMonth(){
		return ILA_API_Repository.getInstance().getSupplier_Revenue_AllMonth();
	}
	
	@GetMapping("/getSupplier_Revenue_AllDay")
	public List<BigDecimal> getSupplier_Revenue_AllDay(int month){
		return ILA_API_Repository.getInstance().getSupplier_Revenue_AllDay(month);
	}
	
	
	//NEW ORDER DETAIL 30/9/2023
	
	@GetMapping("/getDetailOrder")
	public List<InvoiceView> Supplier_detailOrders () {
		return ILA_API_Repository.getInstance().Supplier_detailOrders();
	}
	
	@PostMapping("/ConfirmInvDetail")
	public boolean Supplier_ConfirmInvDetail(InvoiceDetails modelUpdate) {
		return ILA_API_Repository.getInstance().Supplier_ConfirmInvDetail(modelUpdate);
	}
	
	@PostMapping("/ConfirmInv")
	public boolean Supplier_ConfirmInv(Invoice modelUpdate) {
		return ILA_API_Repository.getInstance().Supplier_ConfirmInv(modelUpdate);
	}
	
	//NEW ORDER 30/9/2023
	
	@GetMapping("/GetNameAddDate")
	public List<InvoiceView> Supplier_GetNameAddDate(int id){
		return ILA_API_Repository.getInstance().Supplier_GetNameAddDate(id);
	}
	
	@GetMapping("/GetTotalOrderAmount")
	public InvoiceView getSupplier_GetTotalOrderAmount(int idSupplier){
		return ILA_API_Repository.getInstance().getSupplier_GetTotalOrderAmount(idSupplier);
	}
	
	@GetMapping("/GetTotalAmountOfProduct")
	public InvoiceView Supplier_GetTotalAmountOfProduct(int idSupplier){
		return ILA_API_Repository.getInstance().Supplier_GetTotalAmountOfProduct(idSupplier);
	}
	
	@GetMapping("/GetRefundtoCustomers")
	public InvoiceView Supplier_GetRefundtoCustomers(int idSupplier){
		return ILA_API_Repository.getInstance().Supplier_GetRefundtoCustomers(idSupplier);
	}
	
	@GetMapping("/GetMoneyReceived")
	public InvoiceSupplier Supplier_GetMoneyReceived(int idSupplier){
		return ILA_API_Repository.getInstance().Supplier_GetMoneyReceived(idSupplier);
	}
	
	@GetMapping("/GetPriceVoucher")
	public Voucher Supplier_GetPriceVoucher (int id, String usercreate) {
		return ILA_API_Repository.getInstance().Supplier_GetPriceVoucher(id, usercreate);
	}
	
	@PostMapping("/GetXacNhanDaNhanTienSupp")
	public boolean Supplier_GetXacNhanDaNhanTienSupp(InvoiceSupplier modelUpdate) {
		return ILA_API_Repository.getInstance().Supplier_GetXacNhanDaNhanTienSupp(modelUpdate);
	} 
	
	@GetMapping("/ActionOrder")
	public InvoiceSupplier Supplier_ActionOrder(int isStatus,int status) {
		return ILA_API_Repository.getInstance().Supplier_ActionOrder(isStatus, status);
	}
	
	
	
	
	
	
}
