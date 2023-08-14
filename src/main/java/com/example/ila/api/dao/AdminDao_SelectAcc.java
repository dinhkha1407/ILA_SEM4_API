package com.example.ila.api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Account;
import com.example.ila.api.utils.AccountRowMapper;
import com.example.ila.api.utils.StringValue;

public class AdminDao_SelectAcc implements IDataRepository<Account> {

private static AdminDao_SelectAcc instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static AdminDao_SelectAcc getInstance() {
		if (instance == null) {
			instance = new AdminDao_SelectAcc();
		}
		return instance;
	}
	
	@Autowired   
	
	
	@Override
	public boolean Insert(Account modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(Account modelUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(Account modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Account GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Account> GetAll() {
		
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Account> a = jdbcTemplateObject.query(StringValue.Admin_SelectUser, new AccountRowMapper());
			return a;
		} catch (Exception e) {
			System.out.println("ERROR Select user");
		}
		return null;
	}

}
