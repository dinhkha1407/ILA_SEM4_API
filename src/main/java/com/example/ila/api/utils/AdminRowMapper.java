package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Admin;

public class AdminRowMapper implements RowMapper<Admin>{

	@Override
	public Admin mapRow(ResultSet rs, int rowNum) throws SQLException {
		Admin adm = new Admin();
		adm.setId(rs.getInt("id"));
		adm.setUsername(rs.getString("username"));
		adm.setPassword(rs.getString("password"));
		return adm;
	}
	
}
