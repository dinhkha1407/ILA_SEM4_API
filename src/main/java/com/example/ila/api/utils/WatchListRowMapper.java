package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.WatchList;

public class WatchListRowMapper implements RowMapper<WatchList> {

	@Override
	public WatchList mapRow(ResultSet rs, int rowNum) throws SQLException {
		WatchList wat = new WatchList();
		wat.setId(rs.getInt("id"));
		wat.setIdProduct(rs.getInt("idproduct"));
		wat.setIdAccount(rs.getInt("idAccount"));
		wat.setCreateDate(rs.getDate("createDate"));
		wat.setCountWatch(rs.getInt("countWatch"));
		return wat;
	}

}
