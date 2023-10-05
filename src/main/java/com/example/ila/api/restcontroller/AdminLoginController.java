package com.example.ila.api.restcontroller;

import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Admin;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminLoginController {
	
	@PostMapping("/Login")
	public Admin LoginAdmin(@RequestBody Admin adm ) {
		return ILA_API_Repository.getInstance().AdminLogin(adm);
	} 
	
	@PostMapping("/UpdateAdmin")
	public boolean Update(@RequestBody Admin modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
	@PostMapping("/CheckEmailPwd")
	public Admin Admin_CheckEmailPwd(String email) {
		return ILA_API_Repository.getInstance().Admin_CheckEmailPwd(email);
	}
}
