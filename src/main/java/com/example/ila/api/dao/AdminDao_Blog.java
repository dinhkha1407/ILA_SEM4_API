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
import com.example.ila.api.models.Account;
import com.example.ila.api.models.Blog;
import com.example.ila.api.utils.BlogRowMapper;
import com.example.ila.api.utils.StringValue;

public class AdminDao_Blog implements IDataRepository<Blog> {
	private static AdminDao_Blog instance = null;

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Blog getInstance() {
		if (instance == null) {
			instance = new AdminDao_Blog();
		}
		return instance;
	}

	@Autowired
	@Override
	public boolean Insert(Blog modelInsert) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_InsertBlog, modelInsert.getTitle(), modelInsert.getImage(),
					modelInsert.getDescription(), modelInsert.getCreateDate(), modelInsert.getIdAccount(),
					modelInsert.getUserCreate(), modelInsert.getIsStatus());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Insert Blog Admin");
		}
		return check;
	}

	@Override
	public boolean Update(Blog modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_EditBlog, modelUpdate.getTitle(), modelUpdate.getImage(),
					modelUpdate.getDescription(), modelUpdate.getCreateDate(), modelUpdate.getIdAccount(),
					modelUpdate.getUserCreate(), modelUpdate.getIsStatus());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR update Blog Admin");
		}
		return check;
	}

	@Override
	public boolean Delete(Blog modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Blog GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Blog> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> Admin_SelectBlog() {
		List<Blog> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Blog> b = jdbcTemplateObject.query(StringValue.Admin_SelectBlog, new BlogRowMapper());
			ls.addAll(b);
		} catch (Exception e) {
			System.out.println("ERROR select Blog Admin");
		}
		return ls;
	}

	public Blog Admin_SelectDetailBlog(int id) {
		Blog b = new Blog();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			b = jdbcTemplateObject.queryForObject(StringValue.Admin_SelectDetailBlog, new BlogRowMapper(), id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR select DETAIL Blog Admin");
		}
		return b;
	}

//	public List<CommentBlogView> Admin_GetCMTDetailBlog(int idBlog){
//		List<CommentBlogView> ls = new ArrayList<>();
//		try {
//			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
//			List<CommentBlogView> cmt = jdbcTemplateObject.query(StringValue.Admin_GetCMTDetailBlog,
//					new RowMapper<CommentBlogView>() {
//
//						@Override
//						public CommentBlogView mapRow(ResultSet rs, int rowNum) throws SQLException {
//							CommentBlogView cm = new CommentBlogView();
//							cm.setId(rs.getInt("id"));
//							cm.setComment(rs.getString("comment"));
//							cm.setReply(rs.getString("reply"));
//							cm.setCommentDate(rs.getDate("commentDate"));
//							cm.setReplyDate(rs.getDate("replyDate"));
//							cm.setNameCus(rs.getString("nameCus"));
//							return cm;
//						}
//				
//			},idBlog );
//			ls.addAll(cmt);
//		} catch (Exception e) {
//			System.out.println("ERROR select CMT DETAIL Blog Admin");
//		}
//		return ls;
//	}

	public Blog Admin_GetByIdBlog(int id) {
		Blog b = new Blog();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			b = jdbcTemplateObject.queryForObject(StringValue.Admin_GetByIdBlog, new BlogRowMapper(),
					new Object[] { id });
		} catch (Exception e) {
			System.out.println("ERROR GET ID BLOGS");
		}
		return b;
	}

	public List<Blog> Admin_FilterBlog(int isStatus) {
		List<Blog> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Blog> b = jdbcTemplateObject.query(StringValue.Admin_FilterBlog, new BlogRowMapper(), isStatus);
			ls.addAll(b);
		} catch (Exception e) {
			System.out.println("ERROR FILTER Blog Admin");
		}
		return ls;
	}

	public List<Blog> Admin_SelectBlogOfSupp() {
		List<Blog> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Blog> b = jdbcTemplateObject.query(StringValue.Admin_SelectBlogOfSupp, new BlogRowMapper());
			ls.addAll(b);
		} catch (Exception e) {
			System.out.println("ERROR Select Blog Of Supp_Admin");
		}
		return ls;
	}

	public Blog Admin_BlogDetailsOfSup(int id) {
		Blog b = new Blog();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			b = jdbcTemplateObject.queryForObject(StringValue.Admin_BlogDetailsOfSup, new BlogRowMapper(), id);
		} catch (Exception e) {
			System.out.println("ERROR Detail Blog supp_Admin");
		}
		return b;
	}

	public boolean Admin_UpdateBlogDetailOfSup(Blog ModelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdateBlogDetailOfSup, ModelUpdate.getIsStatus(),
					ModelUpdate.getId());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR update Blog detail of sup _ admin");
		}
		return check;
	}

	public List<CommentBlogView> Admin_getCommentMain(int idBlog) {
		List<CommentBlogView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<CommentBlogView> cmt = jdbcTemplateObject.query(StringValue.Admin_GetCMTMainDetailBlog,
					new RowMapper<CommentBlogView>() {

						@Override
						public CommentBlogView mapRow(ResultSet rs, int rowNum) throws SQLException {
							CommentBlogView cm = new CommentBlogView();
							cm.setId(rs.getInt("id"));
							cm.setIdBlog(rs.getInt("idBlog"));
							cm.setIdAccount(rs.getString("idAccount"));
							cm.setComment(rs.getString("comment"));
							cm.setDateCreate(rs.getDate("dateCreate"));
							cm.setIndC(rs.getInt("indC"));
							cm.setMnC(rs.getInt("mnC"));
							cm.setStatus(rs.getInt("status"));
							return cm;
						}

					}, idBlog);
			ls.addAll(cmt);
		} catch (Exception e) {
			System.out.println("ERROR Admin_getCommentMain");
		}
		return ls;
	}

	public List<CommentBlogView> Admin_getCommentSub(int idBlog) {
		List<CommentBlogView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<CommentBlogView> cmt = jdbcTemplateObject.query(StringValue.Admin_GetCMTSubDetailBlog,
					new RowMapper<CommentBlogView>() {

						@Override
						public CommentBlogView mapRow(ResultSet rs, int rowNum) throws SQLException {
							CommentBlogView cm = new CommentBlogView();
							cm.setId(rs.getInt("id"));
							cm.setIdBlog(rs.getInt("idBlog"));
							cm.setIdAccount(rs.getString("idAccount"));
							cm.setComment(rs.getString("comment"));
							cm.setDateCreate(rs.getDate("dateCreate"));
							cm.setIndC(rs.getInt("indC"));
							cm.setMnC(rs.getInt("mnC"));
							cm.setStatus(rs.getInt("status"));
							return cm;
						}

					}, idBlog);
			ls.addAll(cmt);
		} catch (Exception e) {
			System.out.println("ERROR Admin_getCommentSub");
		}
		return ls;
	}

}
