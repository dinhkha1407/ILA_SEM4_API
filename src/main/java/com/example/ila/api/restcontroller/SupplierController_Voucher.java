package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Voucher;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_Voucher {
	
	@PostMapping("/InsertVoucher")
	public boolean Insert(Voucher modelInsert) {
		return ILA_API_Repository.getInstance().Insert(modelInsert);
	}
	
	
	@PostMapping("/UpdateVoucher")
	public boolean Update(Voucher modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	@GetMapping("/GetAllVoucher")
	public List<Voucher> GetAllVoucher(String usercreate){
		return ILA_API_Repository.getInstance().GetAllVoucher(usercreate);
	}
	
	@GetMapping("/FilterVoucher1")
	public List<Voucher> Supplier_FilterVoucher1(String usercreate){
		return ILA_API_Repository.getInstance().Supplier_FilterVoucher1(usercreate);
	}
	
	@GetMapping("/FilterVoucher3")
	public List<Voucher> Supplier_FilterVoucher3(String usercreate){
		return ILA_API_Repository.getInstance().Supplier_FilterVoucher3(usercreate);
	}
	
	
	@GetMapping("/FilterVoucher2")
	public List<Voucher> Supplier_FilterVoucher2(String usercreate){
		return ILA_API_Repository.getInstance().Supplier_FilterVoucher2(usercreate);
	}
	
	
}
