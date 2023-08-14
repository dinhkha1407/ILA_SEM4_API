package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.CommentBlog;

public class CommentBlogRowMapper implements RowMapper<CommentBlog> {

	@Override
	public CommentBlog mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentBlog cmtb = new CommentBlog();
		cmtb.setId(rs.getInt("id"));
		cmtb.setIdBlog(rs.getInt("idBlog"));
		cmtb.setIdAccount(rs.getInt("idAccount"));
		cmtb.setComment(rs.getString("comment"));
		return cmtb;
	}
}
