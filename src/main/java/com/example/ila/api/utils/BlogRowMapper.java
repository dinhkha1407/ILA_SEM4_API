package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Blog;

public class BlogRowMapper implements RowMapper<Blog>{

	@Override
	public Blog mapRow(ResultSet rs, int rowNum) throws SQLException {
		Blog b = new Blog();
		b.setId(rs.getInt("id"));
		b.setTitle(rs.getString("title"));
		b.setImage(rs.getString("image"));
		b.setDescription(rs.getString("description"));
		b.setCreateDate(rs.getDate("createDate"));
		b.setIdAccount(rs.getInt("idAccount"));
		b.setUserCreate(rs.getInt("userCreate"));
		b.setIsStatus(rs.getInt("isStatus"));
		return b;
	}

}
