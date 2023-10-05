package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.ProductView;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Product {

	@GetMapping("/GetAllProdutc")
	public List<ProductView> GetAllProdSup() {
		return ILA_API_Repository.getInstance().GetAllProdOfSup();
	}
	
	@PostMapping("/UpdateActiveProd")
	public boolean UpdateActiveProd(@RequestBody ProductView modelUpdate) {
		return ILA_API_Repository.getInstance().UpdateActiveProd(modelUpdate);
	}
	
	@GetMapping("/FilterActiveProdOfSup")
	public List<ProductView> Admin_FilterActiveProdOfSup(int isActive, int idSupplier){
		return ILA_API_Repository.getInstance().Admin_FilterActiveProdOfSup(isActive, idSupplier);
	}
	@GetMapping("/FilterActiveProd")
	public List<ProductView> Admin_FilterActiveProd(int isActive){
		return ILA_API_Repository.getInstance().Admin_FilterActiveProd(isActive);
	}
	@GetMapping("/FilterProdSupp")
	public List<ProductView> Admin_FilterProdSupp(int idSupplier){
		return ILA_API_Repository.getInstance().Admin_FilterProdSupp(idSupplier);
	}
	
}
