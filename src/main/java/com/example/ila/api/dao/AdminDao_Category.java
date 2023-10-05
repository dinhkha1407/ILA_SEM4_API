package com.example.ila.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Category;
import com.example.ila.api.utils.CategoryRowMapper;
import com.example.ila.api.utils.StringValue;

public class AdminDao_Category implements IDataRepository<Category> {
private static AdminDao_Category instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Category getInstance() {
		if (instance == null) {
			instance = new AdminDao_Category();
		}
		return instance;
	}
	@Autowired   
	@Override
	public boolean Insert(Category modelInsert) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_InsertCate, modelInsert.getTitle(), modelInsert.getCreateDate(), modelInsert.isActive());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Insert Cate Admin");
		}
		return check;
	}

	@Override
	public boolean Update(Category modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdateCate, modelUpdate.getTitle(), modelUpdate.getCreateDate(), modelUpdate.isActive(), modelUpdate.getId());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR UPDATE Cate Admin");
		}
		return check;
	}

	@Override
	public boolean Delete(Category modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Category GetById(Integer idModel) {
		
		return null;
	}

	@Override
	public List<Category> GetAll() {
		List<Category> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Category> c = jdbcTemplateObject.query(StringValue.Admin_SelectCate, new CategoryRowMapper());
			ls.addAll(c);
		} catch (Exception e) {
			System.out.println("ERROR Select Cate Admin");
		}
		return ls;
	}
	
	public Category GetByIdCate(int id) {
		Category c = new Category();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			c = jdbcTemplateObject.queryForObject(StringValue.Admin_GetCateById,new CategoryRowMapper(), new Object[] { id } );
		} catch (Exception e) {
			System.out.println("ERROR get ID Cate Admin");
		}
		return c;
	}
	
	public boolean UpdateActive(Category modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdateActive, modelUpdate.isActive(), modelUpdate.getId());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR UPDATE Active Cate Admin");
		}
		return check;
	}
	
	public List<Category> Admin_FilterCategory( int isActive){
		List<Category> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Category> c = jdbcTemplateObject.query(StringValue.Admin_FilterCategory, new CategoryRowMapper(),isActive);
			ls.addAll(c);
		} catch (Exception e) {
			System.out.println("ERROR Filter Active Cate Admin");
		}
		return ls;
	}
	
}
