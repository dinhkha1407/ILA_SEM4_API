package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.CommentBlogView;
import com.example.ila.api.models.Blog;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Blog {

	@PostMapping("/InsertBlogAdmin")
	public boolean InsertBlogAdmin(@RequestBody Blog modelInsert) {
		return ILA_API_Repository.getInstance().InsertBlogAdmin(modelInsert);
	}

	@GetMapping("/GetAllBlogAdmin")
	public List<Blog> Admin_SelectBlog() {
		return ILA_API_Repository.getInstance().Admin_SelectBlog();
	}

	@GetMapping("/DetailBlog")
	public Blog Admin_SelectDetailBlog(int id) {
		return ILA_API_Repository.getInstance().Admin_SelectDetailBlog(id);
	}

	@GetMapping("/GetID")
	public Blog Admin_GetByIdBlog(int id) {
		return ILA_API_Repository.getInstance().Admin_GetByIdBlog(id);
	}

	@PostMapping("/UpdateBlogAdmin")
	public boolean UpdateBlogAdmin(@RequestBody Blog modelUpdate) {
		return ILA_API_Repository.getInstance().UpdateBlogAdmin(modelUpdate);
	}

	@GetMapping("/FilterBlog")
	public List<Blog> Admin_FilterBlog(int isStatus) {
		return ILA_API_Repository.getInstance().Admin_FilterBlog(isStatus);
	}

	@GetMapping("/GetBlogSupp")
	public List<Blog> Admin_SelectBlogOfSupp() {
		return ILA_API_Repository.getInstance().Admin_SelectBlogOfSupp();
	}

	@PostMapping("/DetailBlogSupp")
	public Blog Admin_BlogDetailsOfSup(int id) {
		return ILA_API_Repository.getInstance().Admin_BlogDetailsOfSup(id);
	}

	@PostMapping("/UpdateBlogSup")
	public boolean Admin_UpdateBlogDetailOfSup(@RequestBody Blog ModelUpdate) {
		return ILA_API_Repository.getInstance().Admin_UpdateBlogDetailOfSup(ModelUpdate);
	}

	@GetMapping("/GetCommentMain")
	public List<CommentBlogView> Admin_getCommentMain(int idBlog) {
		return ILA_API_Repository.getInstance().Admin_getCommentMain(idBlog);
	}

	@GetMapping("/GetCommentSub")
	public List<CommentBlogView> Admin_getCommentSub(int idBlog) {
		return ILA_API_Repository.getInstance().Admin_getCommentSub(idBlog);
	}
	
	
}
