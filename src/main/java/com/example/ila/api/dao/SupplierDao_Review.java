package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.ModelView.ReviewView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Product;
import com.example.ila.api.models.Review;
import com.example.ila.api.utils.StringValue;

public class SupplierDao_Review implements IDataRepository<ReviewView> {

	private static SupplierDao_Review instance = null;
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Review getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Review();
		}
		return instance;
	}
	@Autowired
	@Override
	public boolean Insert(ReviewView modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(ReviewView modelUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(ReviewView modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ReviewView GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ReviewView> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public ReviewView getDataReview(int idProduct) {
		ReviewView r = new ReviewView();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			r = jdbcTemplateObject.queryForObject(StringValue.Supplier_SelectReviewProd,
					new RowMapper<ReviewView>() {

						@Override
						public ReviewView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ReviewView rv = new ReviewView();
							rv.setIdProduct(rs.getInt("idProduct"));
							rv.setNameProd(rs.getString("nameProd"));
							//rv.setReview(rs.getInt("review"));
							rv.setAvgReview(rs.getFloat("avgReview"));
							rv.setCountReview(rs.getInt("countReview"));
							//rv.setId(rs.getInt("id"));
							return rv;
						}
			},idProduct);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR get review");
		}
		return  r;
	}
	
	public List<ReviewView> getDetailReview(int idProduct){
		List<ReviewView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ReviewView> rv = jdbcTemplateObject.query(StringValue.Supplier_DetailReview,
					new RowMapper<ReviewView>() {

						@Override
						public ReviewView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ReviewView r = new ReviewView();
							r.setIdProduct(rs.getInt("idProduct"));
							r.setNameCus(rs.getString("nameCus"));
							r.setReview(rs.getInt("review"));
							r.setCreateDate(rs.getDate("createDate"));
							return r;
						}
				
			}, idProduct );
			ls.addAll(rv);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR get detail review");
		}
		return ls;
	}
	
	public List<ReviewView> SearchFilterReview(int idProduct, int review){
		List<ReviewView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ReviewView> rv = jdbcTemplateObject.query(StringValue.Supplier_FilterReview ,  
					new RowMapper<ReviewView>() {

						@Override
						public ReviewView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ReviewView r = new ReviewView();
							r.setNameCus(rs.getString("nameCus"));
							r.setReview(rs.getInt("review"));
							r.setCreateDate(rs.getDate("createDate"));
							return r;
						}
				
			},idProduct, review );
			ls.addAll(rv);
		} catch (Exception e) {
			System.out.println("ERROR Filter review");
		}
		return ls;
	}
	
	public int Supplier_CountReview(int idProduct) {
		Review r = new Review();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			r = jdbcTemplateObject.queryForObject(StringValue.Supplier_CountReview,
					new RowMapper<Review>() {
				@Override
				public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Review p = new Review();
					p.setCountReview(rs.getInt("countReview"));
					return p;
				}
			},
					idProduct);
		} catch (DataAccessException e) {
			System.out.println("ERROR Count Review : " + e.getMessage());
			return 0;
		} catch (Exception e) {
			System.out.println("ERROR Count Review : " + e.getMessage());
			return 0;
		
		}
		return r.getCountReview();
	}
	
	public int Supplier_CountFilterReview(int idProduct , int review) {
		Review r = new Review();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			r = jdbcTemplateObject.queryForObject(StringValue.Supplier_CountFilterReview,
					new RowMapper<Review>() {
				@Override
				public Review mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Review p = new Review();
					p.setCountFilter(rs.getInt("countFilter"));
					return p;
				}
			},
					idProduct, review);
		} catch (DataAccessException e) {
			System.out.println("ERROR Count Filter Review : " + e.getMessage());
			return 0;
		} catch (Exception e) {
			System.out.println("ERROR Count Filter Review : " + e.getMessage());
			return 0;
		
		}
		return r.getCountFilter();
	}
	
	
	

}
