package com.example.ila.api.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Admin;
import com.example.ila.api.utils.AdminRowMapper;
import com.example.ila.api.utils.StringValue;
import com.example.ila.api.config.*;

@Repository 
public class AdminDao_Login implements IDataRepository<Admin>{

	private static AdminDao_Login instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Login getInstance() {
		if (instance == null) {
			instance = new AdminDao_Login();
		}
		return instance;
	}
	
	@Autowired   
	@Override
	public boolean Update(Admin modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdatePwd, modelUpdate.getPassword(), modelUpdate.getEmail() );
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Update PWD");
		}
		return check;
	}

	@Override
	public boolean Delete(Admin modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Admin GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Admin> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean Insert(Admin modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public Admin Login(Admin adm) {
		Admin a = new Admin();
		try {
			
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			a = jdbcTemplateObject.queryForObject(StringValue.Admin_Login ,new AdminRowMapper(), new Object[] 
			 { adm.getUsername(), adm.getPassword()});
		} catch (Exception e) {
			
			System.out.println("ERROR Loginnnnnnnn");
		}
		return a;
	}
	
	
	public Admin Admin_CheckEmailPwd(String email) {
		Admin a = new Admin();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			a = jdbcTemplateObject.queryForObject(StringValue.Admin_CheckEmailPwd, new AdminRowMapper(),email); 
		} catch (Exception e) {
			System.out.println("ERROR CheckEmailPwd");
			System.out.println(e.getMessage());
		}
		return a; 
	}
	
}
