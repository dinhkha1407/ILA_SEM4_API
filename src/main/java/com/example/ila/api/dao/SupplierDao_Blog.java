package com.example.ila.api.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Blog;
import com.example.ila.api.utils.BlogRowMapper;
import com.example.ila.api.utils.StringValue;

public class SupplierDao_Blog implements IDataRepository<Blog> {
	
	private static SupplierDao_Blog instance = null;
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Blog getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Blog();
		}
		return instance;
	}
	
	@Autowired
	@Override
	public boolean Insert(Blog modelInsert) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_InsertBlog,
			  modelInsert.getTitle(), modelInsert.getImage(), modelInsert.getDescription(), modelInsert.getCreateDate(), modelInsert.getIdAccount(), modelInsert.getUserCreate());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR INSERT Blog");
		}
		return Check;
	}

	@Override
	public boolean Update(Blog modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_UpdateBlog,
				modelUpdate.getTitle(), modelUpdate.getImage(), modelUpdate.getDescription(), modelUpdate.getCreateDate(), modelUpdate.getIdAccount(), modelUpdate.getUserCreate(), modelUpdate.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Update Blog");
		}
		return Check;
	}

	@Override
	public boolean Delete(Blog modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Blog GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Blog> GetAllBlog( int userCreate){
		List<Blog> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Blog> b = jdbcTemplateObject.query(StringValue.Supplier_SelectBlog, new BlogRowMapper(), userCreate);
			ls.addAll(b);
		} catch (Exception e) {
			System.out.println("ERROR select Blog");
		}
		return ls; 
	}
	
	public Blog DetailBlog (int id){
		Blog b = new Blog();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			b = jdbcTemplateObject.queryForObject(StringValue.Supplier_DetailBlog, new BlogRowMapper(), id);
		} catch (Exception e) {
			System.out.println("ERROR select DetailBlog");
		}
		return b;
	}
	
}
