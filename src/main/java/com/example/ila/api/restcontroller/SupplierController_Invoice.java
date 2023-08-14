package com.example.ila.api.restcontroller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.InvoiceView;
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
	public void ConfirmInvoice(int id , int isStatus) {
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
}
