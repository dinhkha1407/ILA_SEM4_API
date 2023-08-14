package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.example.ila.api.ModelView.DiscountView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.utils.StringValue;

public class SupplierDao_Discount implements IDataRepository<DiscountView> {

	private static SupplierDao_Discount instance = null;
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Discount getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Discount();
		}
		return instance;
	}
	@Autowired
	@Override
	public boolean Insert(DiscountView modelInsert) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_InsertDiscount,
			    modelInsert.getDiscount(), modelInsert.getDateBegin(), modelInsert.getDateEnd(), modelInsert.getIdProduct(), modelInsert.getIsStatus());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR INSERT Discount");
		}
		return Check;
	}

	@Override
	public boolean Update(DiscountView modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_UpdateDiscount,
				modelUpdate.getDiscount(), modelUpdate.getDateBegin(), modelUpdate.getDateEnd(), modelUpdate.getIdProduct(), modelUpdate.getIsStatus());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Update Discount");
		}
		return Check;
	}

	@Override
	public boolean Delete(DiscountView modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DiscountView GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DiscountView> GetAll() {
		List<DiscountView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<DiscountView> di =  jdbcTemplateObject.query(StringValue.Supplier_SelectDiscount,
					new RowMapper<DiscountView>() {

						@Override
						public DiscountView mapRow(ResultSet rs, int rowNum) throws SQLException {
							DiscountView d = new DiscountView();
							d.setId(rs.getInt("id"));
							d.setDiscount(rs.getBigDecimal("discount"));
							d.setDateBegin(rs.getDate("dateBegin"));
							d.setDateEnd(rs.getDate("dateEnd"));
							d.setIdProduct(rs.getInt("idProduct"));
							d.setIsStatus(rs.getInt("isStatus"));
							d.setTitle(rs.getString("title"));
							d.setPrice(rs.getBigDecimal("price"));
							d.setSalePrice(rs.getBigDecimal("SalePrice"));
							return d;
						}
			} );
			ls.addAll(di);
		} catch (Exception e) {
			System.out.println("ERROR Select Discount");
		}
		return ls;
	}
	
	public List<DiscountView> Supplier_FilterDiscount1(int idSupplier){
		List<DiscountView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<DiscountView> di = jdbcTemplateObject.query(StringValue.Supplier_FilterDiscount1, 
					new RowMapper<DiscountView>() {

						@Override
						public DiscountView mapRow(ResultSet rs, int rowNum) throws SQLException {
							DiscountView d = new DiscountView();
							d.setId(rs.getInt("id"));
							d.setDiscount(rs.getBigDecimal("discount"));
							d.setDateBegin(rs.getDate("dateBegin"));
							d.setDateEnd(rs.getDate("dateEnd"));
							d.setIdProduct(rs.getInt("idProduct"));
							d.setIsStatus(rs.getInt("isStatus"));
							d.setTitle(rs.getString("title"));
							d.setPrice(rs.getBigDecimal("price"));
							d.setSalePrice(rs.getBigDecimal("SalePrice"));
							return d;
						}
				
			},idSupplier );
			ls.addAll(di);
		} catch (Exception e) {
			System.out.println("ERROR Filter Discount 1");
		}
		return ls; 
	}
	
	public List<DiscountView> Supplier_FilterDiscount2(int idSupplier){
		List<DiscountView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<DiscountView> di = jdbcTemplateObject.query(StringValue.Supplier_FilterDiscount2, 
					new RowMapper<DiscountView>() {

						@Override
						public DiscountView mapRow(ResultSet rs, int rowNum) throws SQLException {
							DiscountView d = new DiscountView();
							d.setId(rs.getInt("id"));
							d.setDiscount(rs.getBigDecimal("discount"));
							d.setDateBegin(rs.getDate("dateBegin"));
							d.setDateEnd(rs.getDate("dateEnd"));
							d.setIdProduct(rs.getInt("idProduct"));
							d.setIsStatus(rs.getInt("isStatus"));
							d.setTitle(rs.getString("title"));
							d.setPrice(rs.getBigDecimal("price"));
							d.setSalePrice(rs.getBigDecimal("SalePrice"));
							return d;
						}
				
			},idSupplier );
			ls.addAll(di);
		} catch (Exception e) {
			System.out.println("ERROR Filter Discount 2");
		}
		return ls; 
	}
	
	public List<DiscountView> Supplier_FilterDiscount3(int idSupplier){
		List<DiscountView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<DiscountView> di = jdbcTemplateObject.query(StringValue.Supplier_FilterDiscount3, 
					new RowMapper<DiscountView>() {

						@Override
						public DiscountView mapRow(ResultSet rs, int rowNum) throws SQLException {
							DiscountView d = new DiscountView();
							d.setId(rs.getInt("id"));
							d.setDiscount(rs.getBigDecimal("discount"));
							d.setDateBegin(rs.getDate("dateBegin"));
							d.setDateEnd(rs.getDate("dateEnd"));
							d.setIdProduct(rs.getInt("idProduct"));
							d.setIsStatus(rs.getInt("isStatus"));
							d.setTitle(rs.getString("title"));
							d.setPrice(rs.getBigDecimal("price"));
							d.setSalePrice(rs.getBigDecimal("SalePrice"));
							return d;
						}
				
			},idSupplier );
			ls.addAll(di);
		} catch (Exception e) {
			System.out.println("ERROR Filter Discount 3");
		}
		return ls; 
	}
	
	
	
	
}
