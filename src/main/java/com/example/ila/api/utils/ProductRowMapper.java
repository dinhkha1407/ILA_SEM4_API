package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Product;

public class ProductRowMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product p = new Product();
		p.setId(rs.getInt("id"));
		p.setTitle(rs.getString("title"));
		p.setImage(rs.getString("image"));
		p.setImage1(rs.getString("image1"));
		p.setImage2(rs.getString("image2"));
		p.setImage3(rs.getString("image3"));
		p.setDescription(rs.getString("description"));
		p.setPrice(rs.getBigDecimal("price"));
		p.setIdSupplier(rs.getInt("idSupplier"));
		p.setIsActive(rs.getInt("isActive"));
		p.setIdcate(rs.getInt("idcate"));
		return p;
	}

}
