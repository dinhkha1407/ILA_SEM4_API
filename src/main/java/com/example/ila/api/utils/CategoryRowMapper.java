package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Category;

public class CategoryRowMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Category cate = new Category();
		cate.setId(rs.getInt("id"));
		cate.setTitle(rs.getString("title"));
		cate.setCreateDate(rs.getDate("createDate"));
		cate.setActive(rs.getBoolean("isActive"));
		return cate;
	}
}
