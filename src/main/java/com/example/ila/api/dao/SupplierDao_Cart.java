package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Cart;
import com.example.ila.api.utils.StringValue;

public class SupplierDao_Cart implements IDataRepository<Cart> {
	
	private static SupplierDao_Cart instance = null;
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Cart getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Cart();
		}
		return instance;
	}
	@Autowired
	
	
	@Override
	public boolean Insert(Cart modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(Cart modelUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(Cart modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Cart GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Cart> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public int Supplier_CountCart() {
		Cart c = new Cart();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			c = jdbcTemplateObject.queryForObject(StringValue.Supplier_CountCart,
					new RowMapper<Cart>() {
				@Override
				public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Cart p = new Cart();
					p.setCountCart(rs.getInt("countCart"));
					return p;
				}
			});
		} catch (DataAccessException e) {
			System.out.println("ERROR Count Cart : " + e.getMessage());
			return 0;
		} catch (Exception e) {
			System.out.println("ERROR Count Cart : " + e.getMessage());
			return 0;
		
		}
		return c.getCountCart();
	}
	
	

}
