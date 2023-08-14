package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Blog;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_Blog {
	
	@PostMapping("/InsertBlog")
	public boolean Insert(Blog modelInsert) {
		return ILA_API_Repository.getInstance().Insert(modelInsert);
	}
	@PostMapping("/UpdateBlog")
	public boolean Update(Blog modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	
	//thieu ham get data de update -->
	
	
	
	@GetMapping("/GetAllBlog")
	public List<Blog> GetAllBlog( int userCreate){
		return ILA_API_Repository.getInstance().GetAllBlog(userCreate);
	}
	
	@GetMapping("/DetailBlog")
	public Blog DetailBlog (int id){
		return ILA_API_Repository.getInstance().DetailBlog(id);
	}
	
	
}
