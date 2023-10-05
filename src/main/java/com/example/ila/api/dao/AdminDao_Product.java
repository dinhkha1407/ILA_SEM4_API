package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.ModelView.ProductView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.utils.StringValue;

public class AdminDao_Product implements IDataRepository<ProductView> {
private static AdminDao_Product instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Product getInstance() {
		if (instance == null) {
			instance = new AdminDao_Product();
		}
		return instance;
	}
	
	@Autowired   
	@Override
	public boolean Insert(ProductView modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(ProductView modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdateProd, modelUpdate.getIsActive(), modelUpdate.getId());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Update prod Admin");
		}
		return check;
	}

	@Override
	public boolean Delete(ProductView modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductView GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductView> GetAll() {
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> pv = jdbcTemplateObject.query(StringValue.Admin_SelectProd,
					new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView prodV = new ProductView();
							prodV.setId(rs.getInt("id"));
							prodV.setTitle(rs.getString("title"));
							prodV.setImage(rs.getString("image"));
							prodV.setImage1(rs.getString("image1"));
							prodV.setImage2(rs.getString("image2"));
							prodV.setImage3(rs.getString("image3"));
							prodV.setDescription(rs.getString("description"));
							prodV.setPrice(rs.getBigDecimal("price"));
							prodV.setIsActive(rs.getInt("isActive"));
							prodV.setIdcate(rs.getInt("idcate"));
							prodV.setIdSupplier(rs.getInt("idSupplier"));
							prodV.setNameCate(rs.getString("nameCate"));
							prodV.setNameSupp(rs.getString("nameSupp"));
							return prodV;
						}
				
			});
			ls.addAll(pv);
		} catch (Exception e) {
			System.out.println("ERROR Select prod supp");
		}
		return ls;
	}
	
	
	public List<ProductView> Admin_FilterActiveProdOfSup(int isActive, int idSupplier){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> p = jdbcTemplateObject.query(StringValue.Admin_FilterActiveProdOfSup, 
					new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView prodV = new ProductView();
							prodV.setTitle(rs.getString("title"));
							prodV.setImage(rs.getString("image"));
							prodV.setImage1(rs.getString("image1"));
							prodV.setImage2(rs.getString("image2"));
							prodV.setImage3(rs.getString("image3"));
							prodV.setDescription(rs.getString("description"));
							prodV.setPrice(rs.getBigDecimal("price"));
							prodV.setIsActive(rs.getInt("isActive"));
							prodV.setIdcate(rs.getInt("idcate"));
							prodV.setIdSupplier(rs.getInt("idSupplier"));
							prodV.setNameCate(rs.getString("nameCate"));
							prodV.setNameSupp(rs.getString("nameSupp"));
							return prodV;
						}
			},isActive, idSupplier );
			ls.addAll(p);
		} catch (Exception e) {
			System.out.println("ERROR Filter Active of Supp");
		}
		return ls;
	}
	
	
	public List<ProductView> Admin_FilterActiveProd(int isActive){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> p = jdbcTemplateObject.query(StringValue.Admin_FilterActiveProd,
					new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView prodV = new ProductView();
							prodV.setTitle(rs.getString("title"));
							prodV.setImage(rs.getString("image"));
							prodV.setImage1(rs.getString("image1"));
							prodV.setImage2(rs.getString("image2"));
							prodV.setImage3(rs.getString("image3"));
							prodV.setDescription(rs.getString("description"));
							prodV.setPrice(rs.getBigDecimal("price"));
							prodV.setIsActive(rs.getInt("isActive"));
							prodV.setIdcate(rs.getInt("idcate"));
							prodV.setIdSupplier(rs.getInt("idSupplier"));
							prodV.setNameCate(rs.getString("nameCate"));
							prodV.setNameSupp(rs.getString("nameSupp"));
							return prodV;
						}
				
			},isActive );
			ls.addAll(p);
		} catch (Exception e) {
			System.out.println("ERROR Filter Active Prod");
		}
		return ls; 
	}
	
	public List<ProductView> Admin_FilterProdSupp(int idSupplier){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> p = jdbcTemplateObject.query(StringValue.Admin_FilterProdSupp,
					new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView prodV = new ProductView();
							prodV.setTitle(rs.getString("title"));
							prodV.setImage(rs.getString("image"));
							prodV.setImage1(rs.getString("image1"));
							prodV.setImage2(rs.getString("image2"));
							prodV.setImage3(rs.getString("image3"));
							prodV.setDescription(rs.getString("description"));
							prodV.setPrice(rs.getBigDecimal("price"));
							prodV.setIsActive(rs.getInt("isActive"));
							prodV.setIdcate(rs.getInt("idcate"));
							prodV.setIdSupplier(rs.getInt("idSupplier"));
							prodV.setNameCate(rs.getString("nameCate"));
							prodV.setNameSupp(rs.getString("nameSupp"));
							return prodV;
						}
				
			},idSupplier );
			ls.addAll(p);
		} catch (Exception e) {
			System.out.println("ERROR Admin_FilterProdSupp");
		}
		return ls;
	}
	
	
	
	
	

}
