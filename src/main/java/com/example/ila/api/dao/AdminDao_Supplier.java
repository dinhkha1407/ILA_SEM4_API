package com.example.ila.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Supplier;
import com.example.ila.api.utils.StringValue;
import com.example.ila.api.utils.SupplierRowMapper;

public class AdminDao_Supplier implements IDataRepository<Supplier> {
	
private static AdminDao_Supplier instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Supplier getInstance() {
		if (instance == null) {
			instance = new AdminDao_Supplier();
		}
		return instance;
	}
	
	@Autowired   
	@Override
	public boolean Insert(Supplier modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(Supplier modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdateAccountSupplier, modelUpdate.getIsActive(),modelUpdate.getId());
			 check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Update Account Supplier");
		}
		return check;
	}

	@Override
	public boolean Delete(Supplier modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Supplier GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Supplier> GetAll() {
		List<Supplier> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Supplier> s = jdbcTemplateObject.query(StringValue.Admin_SelectSupplier, new SupplierRowMapper());
			ls.addAll(s);
		} catch (Exception e) {
			System.out.println("ERROR Select Supplier");
		}
		return ls;
	}
	
	public List<Supplier> FilterSupp(int isActive) {
		List<Supplier> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Supplier> s = jdbcTemplateObject.query(StringValue.Admin_FilterSupplier, new SupplierRowMapper(),isActive);
			ls.addAll(s);
		} catch (Exception e) {
			System.out.println("ERROR Filter Supplier");
		}
		return ls;
	}


}
