package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Account;



public class AccountRowMapper implements RowMapper<Account>{
	
		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account a = new Account();
			a.setId(rs.getInt("id"));
			a.setAvatar(rs.getString("avatar"));
			a.setUsername(rs.getString("username"));
			a.setPassword(rs.getString("password"));
			a.setName(rs.getString("name"));
			a.setPhone(rs.getString("phone"));
			a.setEmail(rs.getString("email"));
			a.setCreateDate(rs.getDate("createDate"));
			a.setActive(rs.getBoolean("isActive"));
			return a;
		}
	}

