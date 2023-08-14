package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Supplier;

public class SupplierRowMapper implements RowMapper<Supplier> {

	@Override
	public Supplier mapRow(ResultSet rs, int rowNum) throws SQLException {
		Supplier sup = new Supplier();
		sup.setId(rs.getInt("id"));
		sup.setTitle(rs.getString("title"));
		sup.setPhone(rs.getString("phone"));
		sup.setEmail(rs.getString("email"));
		sup.setAddress(rs.getString("address"));
		sup.setUsername(rs.getString("username"));
		sup.setPassword(rs.getString("password"));
		sup.setRequestDate(rs.getDate("requestDate"));
		sup.setCreateDate(rs.getDate("createDate"));
		sup.setIsActive(rs.getInt("isActive"));
		return sup;
	}

}
