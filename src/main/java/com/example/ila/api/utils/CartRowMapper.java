package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Cart;

public class CartRowMapper implements RowMapper<Cart>{

	@Override
	public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
		Cart c = new Cart();
		c.setId(rs.getInt("id"));
		c.setIdAccount(rs.getInt("idAccount"));
		c.setIdProduct(rs.getInt("idProduct"));
		c.setAmount(rs.getInt("Amount"));
		c.setPrice(rs.getBigDecimal("Price"));
		c.setStatus(rs.getBoolean("Status"));
		return c;
	}

}
