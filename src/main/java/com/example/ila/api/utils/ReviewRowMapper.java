package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Review;

public class ReviewRowMapper implements RowMapper<Review> {

	@Override
	public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
		Review rev = new Review();
		rev.setId(rs.getInt("id"));
		rev.setIdAccount(rs.getInt("idAccount"));
		rev.setIdProduct(rs.getInt("idProduct"));
		rev.setReview(rs.getInt("review"));
		rev.setCreateDate(rs.getDate("createDate"));
		return rev;
	}

}
