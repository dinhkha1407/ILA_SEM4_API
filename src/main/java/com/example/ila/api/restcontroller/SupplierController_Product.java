package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.ProductView;
import com.example.ila.api.models.Category;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_Product {
	
	@GetMapping("/Category")
	public List<Category> getAllCate(){
		return ILA_API_Repository.getInstance().getAllCate();
	}
	
	@GetMapping("/GetProductSupplier")
	public List<ProductView> GetAllProdSupp(int idSupplier) {
		return ILA_API_Repository.getInstance().GetAllProdSupp(idSupplier);
	}
	
	@GetMapping("/FilterActive")
	public List<ProductView>SearchFilterActive(int isActive){
		return ILA_API_Repository.getInstance().SearchFilterActive(isActive);
	}
	
	@PostMapping("/InsertProduct")
	public boolean Insert(ProductView modelInsert) {
		return ILA_API_Repository.getInstance().Insert(modelInsert);
	}
	
	@PostMapping("/UpdateProduct")
	public boolean Update(ProductView modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	@GetMapping("/FilterHighToLow")
	public List<ProductView> SearchFilterHighToLow(){
		return ILA_API_Repository.getInstance().SearchFilterHighToLow();
	}
	
	@GetMapping("/FilterLowToHigh")
	public List<ProductView> SearchFilterLowToHigh(){
		return ILA_API_Repository.getInstance().SearchFilterLowToHigh();
	}
	
	@GetMapping("/FilterDiscount")
	public List<ProductView> SearchFilterDiscount(){
		return ILA_API_Repository.getInstance().SearchFilterDiscount();
	}
}
