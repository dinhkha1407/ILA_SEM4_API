package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Supplier;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Supplier {

	
	@GetMapping("/AllSupplier")
	public List<Supplier> getAllSupplier(){
		return ILA_API_Repository.getInstance().getAllSupplier();
	}
	
	@PostMapping("/UpdateSupplier")
	public boolean Update(@RequestBody Supplier modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	@GetMapping("/FilterSupp")
	public List<Supplier> FilterSupp(int isActive) {
		return ILA_API_Repository.getInstance().FilterSupp(isActive);
	}
}
