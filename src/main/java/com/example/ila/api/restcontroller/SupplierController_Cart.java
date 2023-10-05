package com.example.ila.api.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Cart")
@CrossOrigin("*")
public class SupplierController_Cart {

	@GetMapping("/countCart")
	public int Supplier_CountCart() {
		return ILA_API_Repository.getInstance().Supplier_CountCart();
	}
}
