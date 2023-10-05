package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.models.Account;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Account {

	@GetMapping("/GetAllUser")
	public List<Account> getAll() {
		return ILA_API_Repository.getInstance().getAll();
	}
	@PostMapping("/UpdateActiveUser")
	public boolean Update(@RequestBody Account modelUpdate) {
		return ILA_API_Repository.getInstance().Update(modelUpdate);
	}
	
}
