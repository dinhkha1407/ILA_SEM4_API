package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Category;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Category {
		
	@PostMapping("/InsertCate")
	public boolean Insert(@RequestBody Category modelInsert) {
		return ILA_API_Repository.getInstance().Insert(modelInsert);
	}
	
	@GetMapping("/GetAllCate")
	public List<Category> GetAllCate() {
		return ILA_API_Repository.getInstance().GetAllCate();
	}
	
	@PostMapping("/UpdateCate")
	public boolean Update(@RequestBody Category modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	@PostMapping("/GetIDCate")
	public Category GetByIdCate( int id) {
		return ILA_API_Repository.getInstance().GetByIdCate(id);
	}
	@PostMapping("/UpdateActiveCate")
	public boolean UpdateActive(@RequestBody Category modelUpdate) {
		return ILA_API_Repository.getInstance().UpdateActive(modelUpdate);
	}
	
	@GetMapping("/FilterCate")
	public List<Category> Admin_FilterCategory(int isActive){
		return ILA_API_Repository.getInstance().Admin_FilterCategory(isActive);
	}
	
	
}
