package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.ModelView.CommentBlogView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.utils.StringValue;

public class SupplierDao_CommentBlog implements IDataRepository<CommentBlogView> {

	private static SupplierDao_CommentBlog instance = null;
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_CommentBlog getInstance() {
		if (instance == null) {
			instance = new SupplierDao_CommentBlog();
		}
		return instance;
	}
	
	@Autowired
	
	
	
	@Override
	public boolean Insert(CommentBlogView modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(CommentBlogView modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			//jdbcTemplateObject.update(StringValue.Supplier_UpdateCommentBlog,
				//modelUpdate.getReply(), modelUpdate.getReplyDate(), modelUpdate.getId());
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Update CommentBlog");
		}
		return Check;
	}

	@Override
	public boolean Delete(CommentBlogView modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CommentBlogView GetById(Integer idModel) {
		return null;
	}

	@Override
	public List<CommentBlogView> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<CommentBlogView> getCommentBlogDetail ( int idBlog){
		List<CommentBlogView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<CommentBlogView> cmt = jdbcTemplateObject.query(StringValue.Supplier_CommentDetailBlog, 
					new RowMapper<CommentBlogView>() {

						@Override
						public CommentBlogView mapRow(ResultSet rs, int rowNum) throws SQLException {
							CommentBlogView cmtv = new CommentBlogView();
							cmtv.setId(rs.getInt("id"));
							cmtv.setComment(rs.getString("comment"));
							//cmtv.setReply(rs.getString("reply"));
							//cmtv.setCommentDate(rs.getDate("commentDate"));
							//cmtv.setReplyDate(rs.getDate("replyDate"));
							//cmtv.setNameCus(rs.getString("nameCus"));
							//cmtv.setNameSupp(rs.getString("nameSupp"));
							//cmtv.setIdCus(rs.getInt("idCus"));
							return cmtv;
						}
				
			},idBlog); 
			ls.addAll(cmt);
		} catch (Exception e) {
			System.out.println("ERROR List CommentBlog");
		}
		return ls; 
	}
	
	
	
	public CommentBlogView GetDataCMT(int id) {
		CommentBlogView cmt = new CommentBlogView();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			cmt = jdbcTemplateObject.queryForObject(StringValue.Supplier_GetDataCMT,
					new RowMapper<CommentBlogView>() {

						@Override
						public CommentBlogView mapRow(ResultSet rs, int rowNum) throws SQLException {
							CommentBlogView c = new CommentBlogView();
							//c.setReply(rs.getString("reply"));
							return c;
						}
			},id );
		} catch (Exception e) {
			System.out.println("ERROR Getdata CommentBlog");
		}
		return cmt;
	}
	
}
