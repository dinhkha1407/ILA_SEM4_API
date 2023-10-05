package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Voucher;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Voucher {

	@PostMapping("/InsertVoucherAdmin")
	public boolean InsertVoucherAdmin(@RequestBody Voucher modelInsert) {
		return ILA_API_Repository.getInstance().InsertVoucherAdmin(modelInsert);
	}
	
	@GetMapping("/CheckExistVoucher")
	public Voucher Admin_CheckVoucherExist(int id) {
		return ILA_API_Repository.getInstance().Admin_CheckVoucherExist(id);
	}
	
	@GetMapping("/GetAllVoucher")
	public List<Voucher> GetAllVoucherAdmin() {
		return ILA_API_Repository.getInstance().GetAllVoucherAdmin();
	}
	
	@GetMapping("/FilterVoucher1")
	public List<Voucher> Admin_FilterVoucher1(){
		return ILA_API_Repository.getInstance().Admin_FilterVoucher1();
	}
	
	@GetMapping("/FilterVoucher2")
	public List<Voucher> Admin_FilterVoucher2(){
		return ILA_API_Repository.getInstance().Admin_FilterVoucher2();
	}
	
	@GetMapping("/FilterVoucher3")
	public List<Voucher> Admin_FilterVoucher3(){
		return ILA_API_Repository.getInstance().Admin_FilterVoucher3();
	}
	
	@GetMapping("/GetIDVoucher")
	public Voucher Admin_GetIDVoucher(int id) {
		return ILA_API_Repository.getInstance().Admin_GetIDVoucher(id);
	}
	
	@PostMapping("/UpdateVoucher")
	public boolean UpdateVoucherAdmin(@RequestBody Voucher modelUpdate) {
		return ILA_API_Repository.getInstance().UpdateVoucherAdmin(modelUpdate);
	}
	
	@PostMapping("/DeleteVoucher")
	public boolean Delete(@RequestBody Voucher modelDelete) {
		return ILA_API_Repository.getInstance().Delete(modelDelete);
	}
	
}
