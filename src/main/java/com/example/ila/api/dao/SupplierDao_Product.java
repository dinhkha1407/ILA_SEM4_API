package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.ModelView.ProductView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Category;
import com.example.ila.api.models.Product;
import com.example.ila.api.models.Review;
import com.example.ila.api.models.WatchList;
import com.example.ila.api.utils.CategoryRowMapper;
import com.example.ila.api.utils.ProductRowMapper;
import com.example.ila.api.utils.StringValue;


public class SupplierDao_Product implements IDataRepository<ProductView> {

private static SupplierDao_Product instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Product getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Product();
		}
		return instance;
	}
	
	@Autowired   
	@Override
	public boolean Insert(ProductView modelInsert) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_InsertProdOfSup,
					modelInsert.getTitle(),modelInsert.getImage(),modelInsert.getImage1(),modelInsert.getImage2(),modelInsert.getImage3(),modelInsert.getDescription(),modelInsert.getPrice(), modelInsert.getIdSupplier(), modelInsert.getIsActive(), modelInsert.getIdcate());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR INSERT PROD ");
		}
		return Check;
	}

	@Override
	public boolean Update(ProductView modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_UpdateProdOfSup,
					modelUpdate.getTitle(), modelUpdate.getImage(), modelUpdate.getImage1(), modelUpdate.getImage2(), modelUpdate.getImage3(), modelUpdate.getDescription(), modelUpdate.getPrice(), modelUpdate.getIsActive(), modelUpdate.getIdcate() , modelUpdate.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Update PROD ");
		}
		return Check;
	}
	
	
	public boolean UpdateActiveProd(ProductView modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_UpdateActiveProd,
					modelUpdate.getIsActive(), modelUpdate.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Update PROD Active ");
		}
		return Check;
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
		return null;
	}
	
	public List<Category> getAllCate(){
		List<Category> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Category> c = jdbcTemplateObject.query(StringValue.Supplier_Cate, new CategoryRowMapper());
			ls.addAll(c);
		} catch (Exception e) {
			System.out.println("ERROR Select cate");
		}
		return ls;
	}
	
	
	public List<ProductView> GetAllProdSupp(int idSupplier) {
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> prod = jdbcTemplateObject.query(StringValue.Supplier_SelectProductOfSup,
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
							return prodV;
						}
				
			}, idSupplier );
			ls.addAll(prod);
		} catch (Exception e) {
			System.out.println("ERROR Select PROD OF Sup");
		}
		return ls;
	}

	public List<ProductView>SearchFilterActive(int isActive, int idSupplier){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> prod =  jdbcTemplateObject.query(StringValue.Supplier_SearchActiveProdSup, 
					new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView p = new ProductView();
							p.setId(rs.getInt("id"));
							p.setTitle(rs.getString("title"));
							p.setImage(rs.getString("image"));
							p.setImage1(rs.getString("image1"));
							p.setImage2(rs.getString("image2"));
							p.setImage3(rs.getString("image3"));
							p.setDescription(rs.getString("description"));
							p.setPrice(rs.getBigDecimal("price"));
							p.setIsActive(rs.getInt("isActive"));
							p.setIdcate(rs.getInt("idcate"));
							p.setIdSupplier(rs.getInt("idSupplier"));
							p.setNameCate(rs.getString("nameCate"));
							return p;
						}
				
			}, isActive , idSupplier);
			ls.addAll(prod);
		} catch (Exception e) {
			System.out.println("ERROR Filter Active");
		}
		return ls ;
	}
	
	public List<ProductView> SearchFilterHighToLow(){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
		 	List<ProductView> prod =  jdbcTemplateObject.query(StringValue.Supplier_SearchHighToLow, 
		 			new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView p = new ProductView();
							p.setTitle(rs.getString("title"));
							p.setImage(rs.getString("image"));
							p.setImage1(rs.getString("image1"));
							p.setImage2(rs.getString("image2"));
							p.setImage3(rs.getString("image3"));
							p.setDescription(rs.getString("description"));
							p.setPrice(rs.getBigDecimal("price"));
							p.setIsActive(rs.getInt("isActive"));
							p.setIdcate(rs.getInt("idcate"));
							p.setIdSupplier(rs.getInt("idSupplier"));
							p.setNameCate(rs.getString("nameCate"));
							return p;
						}
		 	});
		 	ls.addAll(prod);
		} catch (Exception e) {
			System.out.println("ERROR Filter High To Low");
		}
		return ls;
	}
	
	public List<ProductView> SearchFilterLowToHigh(){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
		 	List<ProductView> prod =  jdbcTemplateObject.query(StringValue.Supplier_SearchLowToHigh, 
		 			new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView p = new ProductView();
							p.setTitle(rs.getString("title"));
							p.setImage(rs.getString("image"));
							p.setImage1(rs.getString("image1"));
							p.setImage2(rs.getString("image2"));
							p.setImage3(rs.getString("image3"));
							p.setDescription(rs.getString("description"));
							p.setPrice(rs.getBigDecimal("price"));
							p.setIsActive(rs.getInt("isActive"));
							p.setIdcate(rs.getInt("idcate"));
							p.setIdSupplier(rs.getInt("idSupplier"));
							p.setNameCate(rs.getString("nameCate"));
							return p;
						}
		 	});
		 	ls.addAll(prod);
		} catch (Exception e) {
			System.out.println("ERROR Filter Low To High");
		}
		return ls;
	}
	
	public List<ProductView> SearchFilterDiscount(){
		List<ProductView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<ProductView> prod = jdbcTemplateObject.query(StringValue.Supplier_SearchDiscountOfSup, 
					new RowMapper<ProductView>() {

						@Override
						public ProductView mapRow(ResultSet rs, int rowNum) throws SQLException {
							ProductView p = new ProductView();
							p.setTitle(rs.getString("title"));
							p.setImage(rs.getString("image"));
							p.setImage1(rs.getString("image1"));
							p.setImage2(rs.getString("image2"));
							p.setImage3(rs.getString("image3"));
							p.setDescription(rs.getString("description"));
							p.setPrice(rs.getBigDecimal("price"));
							p.setIsActive(rs.getInt("isActive"));
							p.setIdcate(rs.getInt("idcate"));
							p.setIdSupplier(rs.getInt("idSupplier"));
							p.setDiscount(rs.getBigDecimal("discount"));
							p.setFinalPrice(rs.getBigDecimal("finalPrice"));
							return p;
						}
				
			});
			ls.addAll(prod);
		} catch (Exception e) {
			System.out.println("ERROR Filter Discount");
		}
		return ls;
	}
	
	public int CountFilterActive (int idSupplier, int isActive) {
		/*
		 * Product ls = new Product(); try {
		 * 
		 * jdbcTemplateObject = new
		 * JdbcTemplate(DatabaseConnect.getInstance().dbDataSource()); ls =
		 * jdbcTemplateObject.queryForObject(StringValue.Supplier_CountFilterActive, new
		 * ProductRowMapper(),
		 * 
		 * idSupplier, isActive ); } catch (Exception e) {
		 * 
		 * System.out.println("ERROR Count Filter Active"); }
		 * 
		 * return 0;
		 */
		Product ls = new Product();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_CountFilterActive,
					new RowMapper<Product>() {
				@Override
				public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					Product p = new Product();
					p.setCountID(rs.getInt("countID"));
					return p;
				}
			},
					idSupplier, isActive);
		} catch (DataAccessException e) {
			System.out.println("ERROR Count Filter Active: " + e.getMessage());
			return 0;
		} catch (Exception e) {
			System.out.println("ERROR Count Filter Active: " + e.getMessage());
			return 0;
		
		}
		return ls.getCountID();
	}
	
	
	//dem so luong yeu thich
	public int Supplier_WatchList(int idProduct ) {
		WatchList r = new WatchList();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			r = jdbcTemplateObject.queryForObject(StringValue.Supplier_WatchList,
					new RowMapper<WatchList>() {
				@Override
				public WatchList mapRow(ResultSet rs, int rowNum) throws SQLException {
					// TODO Auto-generated method stub
					WatchList p = new WatchList();
					p.setCountWatch(rs.getInt("countWatch"));
					return p;
				}
			},
					idProduct);
		} catch (DataAccessException e) {
			System.out.println("ERROR Count WatchList : " + e.getMessage());
			return 0;
		} catch (Exception e) {
			System.out.println("ERROR Count WatchList : " + e.getMessage());
			return 0;
		
		}
		return r.getCountWatch();
	}
	
	
	
	
}	
	
	

