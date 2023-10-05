package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.DiscountView;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_Discount {

	@PostMapping("/InsertDiscount")
	public boolean Insert(@RequestBody DiscountView modelInsert) {
		return ILA_API_Repository.getInstance().Insert(modelInsert);
	}
	
	@PostMapping("/UpdateDiscount")
	public boolean Update(@RequestBody DiscountView modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	@GetMapping("/GetAllDiscount")
	public List<DiscountView> GetAll() {
		return ILA_API_Repository.getInstance().GetAll();
	}
	
	@GetMapping("/FilterDiscount1")
	public List<DiscountView> Supplier_FilterDiscount1(int idSupplier){
		return ILA_API_Repository.getInstance().Supplier_FilterDiscount1(idSupplier);
	}
	
	@GetMapping("/FilterDiscount2")
	public List<DiscountView> Supplier_FilterDiscount2(int idSupplier){
		return ILA_API_Repository.getInstance().Supplier_FilterDiscount2(idSupplier);
	}
	
	@GetMapping("/FilterDiscount3")
	public List<DiscountView> Supplier_FilterDiscount3(int idSupplier){
		return ILA_API_Repository.getInstance().Supplier_FilterDiscount3(idSupplier);
	}
}
