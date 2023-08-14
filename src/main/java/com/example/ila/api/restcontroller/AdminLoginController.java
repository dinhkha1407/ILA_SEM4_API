package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.ila.api.models.Account;
import com.example.ila.api.models.Admin;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/AdminLogin")
@CrossOrigin("*")
public class AdminLoginController {
	
	@PostMapping("/abc")
	public Admin LoginAdmin(@RequestBody Admin adm ) {
		return ILA_API_Repository.getInstance().AdminLogin(adm);
	} 
	
	@GetMapping("/select")
	public List<Account> getAll() {
		return ILA_API_Repository.getInstance().getAll();
	}
}
