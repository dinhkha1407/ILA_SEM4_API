package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.ReviewView;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_Review {

	@GetMapping("/GetDataReview")
	public ReviewView getDataReview(int idProduct) {
		return ILA_API_Repository.getInstance().getDataReview(idProduct);
	}
	
	@GetMapping("/GetDetailReview")
	public List<ReviewView> getDetailReview(int idProduct){
		return ILA_API_Repository.getInstance().getDetailReview(idProduct);
	}
	
	@GetMapping("/FilterReview")
	public List<ReviewView> SearchFilterReview(int idProduct, int review){
		return ILA_API_Repository.getInstance().SearchFilterReview(idProduct, review);
	}
	
	
}
