package com.example.ila.api.dao;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.ModelView.InvoiceView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.utils.StringValue;

public class SupplierDao_Invoice implements IDataRepository<InvoiceView> {
	
	
private static SupplierDao_Invoice instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Invoice getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Invoice();
		}
		return instance;
	}
	
	@Autowired   
	
	@Override
	public boolean Insert(InvoiceView modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(InvoiceView modelUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(InvoiceView modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InvoiceView GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceView> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<InvoiceView> GetInvoiceOfSupp(int idSupplier){
		List<InvoiceView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceView> inv =	jdbcTemplateObject.query(StringValue.Supplier_SelectInvoiceOfSup, 
				new RowMapper<InvoiceView>() {
					@Override
					public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
						InvoiceView invv = new InvoiceView();
						invv.setId(rs.getInt("id"));
						invv.setNameCus(rs.getString("nameCus"));
						invv.setVoucherA(rs.getString("VoucherA"));
						invv.setVoucherS(rs.getString("VoucherS"));
						invv.setTotalPrice(rs.getBigDecimal("TotalPrice"));
						invv.setCreateDate(rs.getDate("createDate"));
						return invv;
					}
		},
				idSupplier );
		ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Select Invoice OF Sup");
		}
		
		return ls;
	}
	
	
	public void ConfirmInvoiceOfSupp(int id , int isStatus) {
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_UpdateInvoice , new Object[] {
				id , isStatus	
			});
		} catch (Exception e) {
			System.out.println("ERROR Confirm Invoice");
		}
		
	}
	
	public List<InvoiceView> SearchFilterInvoice(int idSupplier, int isStatus){
		List<InvoiceView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceView> lsi =  jdbcTemplateObject.query(StringValue.Supplier_SearchInvoiceFilter, 
					new RowMapper<InvoiceView>() {

						@Override
						public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceView in = new InvoiceView();
							in.setId(rs.getInt("id"));
							in.setNameCus(rs.getString("nameCus"));
							in.setVoucherA(rs.getString("VoucherA"));
							in.setVoucherS(rs.getString("VoucherS"));
							in.setTotalPrice(rs.getBigDecimal("TotalPrice"));
							in.setCreateDate(rs.getDate("createDate"));
							return in;
						}
			}, idSupplier , isStatus );
			
		ls.addAll(lsi);
		
		} catch (Exception e) {
			System.out.println("ERROR Search Filter");
		}
		return ls;
	}
	
	
	public List<InvoiceView> getInvoiceDetails(int idInvoice){
		List<InvoiceView> InDe = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceView> ls = jdbcTemplateObject.query(StringValue.Supplier_SelectInvoiceDetails, 
					new RowMapper<InvoiceView>() {

						@Override
						public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceView in = new InvoiceView();
							in.setNameProduct(rs.getString("nameProduct"));
							in.setUnitPrice(rs.getBigDecimal("unitPrice"));
							in.setAmount(rs.getBigDecimal("Amount"));
							in.setPrice(rs.getBigDecimal("Price"));
							return in;
						}
			}, idInvoice );
			InDe.addAll(ls);
			
		} catch (Exception e) {
			System.out.println("ERROR Select Detai Invoice");
		}
		return InDe;
	}
	
	
	public InvoiceView getSupplier_Revenue_AllMonth(int month){
		InvoiceView ls = new InvoiceView();
		try {
				jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
				ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_Revenue_Month, 
						new RowMapper<InvoiceView>() {
							@Override
							public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
								InvoiceView in = new InvoiceView();
								in.setTotalS(rs.getBigDecimal("totalS"));
								return in;
							}
				}, month );
			
		} catch (Exception e) {
			System.out.println("ERROR getSupplier_Revenue_AllMonth");
		}
		return ls;
	}
	
	public InvoiceView getSupplier_Revenue_AllDay(int day, int month){
		InvoiceView ls = new InvoiceView();
		try {
				jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
				ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_Revenue_Day, 
						new RowMapper<InvoiceView>() {
							@Override
							public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
								InvoiceView in = new InvoiceView();
								in.setTotalS(rs.getBigDecimal("totalS"));
								return in;
							}
				}, day, month );
			
		} catch (Exception e) {
			System.out.println("ERROR getSupplier_Revenue_AllDay");
		}
		return ls;
	}
}
