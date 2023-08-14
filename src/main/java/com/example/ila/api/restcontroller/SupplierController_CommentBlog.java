package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.CommentBlogView;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Supplier")
@CrossOrigin("*")
public class SupplierController_CommentBlog {

	
	@PostMapping("/UpdateCMTBlog")
	public boolean Update(CommentBlogView modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	@GetMapping("/GetDetailCMTBlog")
	public List<CommentBlogView> getCommentBlogDetail ( int idBlog){
		return ILA_API_Repository.getInstance().getCommentBlogDetail(idBlog);
	}
	
	@GetMapping("/GetByIdCMTBlog")
	public CommentBlogView GetDataCMT(int id) {
		return ILA_API_Repository.getInstance().GetDataCMT(id); 
	}
	
}
