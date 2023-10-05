package com.example.ila.api.dao;


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
import com.example.ila.api.models.Invoice;
import com.example.ila.api.models.InvoiceDetails;
import com.example.ila.api.models.InvoiceSupplier;
import com.example.ila.api.models.Voucher;
import com.example.ila.api.utils.StringValue;
import com.example.ila.api.utils.VoucherRowMapper;

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
						invv.setIsStatus(rs.getInt("isStatus"));
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
	
	
	
	//NEW ORDER DETAIL - 30/9/2023
	public List<InvoiceView> Supplier_detailOrders () {
		List<InvoiceView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
	
			List<InvoiceView> inn = jdbcTemplateObject.query(StringValue.Supplier_detailOrders, new RowMapper<InvoiceView>() {

				@Override
				public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceView in = new InvoiceView();
					in.setNameProduct(rs.getString("nameProduct"));
					in.setPriceOrder(rs.getBigDecimal("priceOrder"));
					in.setAmount(rs.getBigDecimal("amount"));
					in.setPrice(rs.getBigDecimal("price"));
					in.setIsStatus(rs.getInt("isStatus"));
					in.setIdInvoiceDetail(rs.getInt("idInvoiceDetail"));
					in.setIdInvoice(rs.getInt("idInvoice"));
					return in;
				}
	});
		ls.addAll(inn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Supplier_detailOrders");
		}
		return ls;
	}
	
	public boolean Supplier_ConfirmInvDetail(InvoiceDetails modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_ConfirmInvDetail,
			modelUpdate.getIsStatus() , modelUpdate.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println(e.getMessage());
			System.out.println("ERROR Update Supplier_ConfirmInvDetail");
		}
		return Check;
	}
	
	public boolean Supplier_ConfirmInv(Invoice modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_ConfirmInv,
			modelUpdate.getIsStatus() , modelUpdate.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println(e.getMessage());
			System.out.println("ERROR Update Supplier_ConfirmInv");
		}
		return Check;
	}
	
	
	
	// NEW ORDER 30/9/2023
	
	
	public List<InvoiceView> Supplier_GetNameAddDate(int id){
		List<InvoiceView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceView> lt = jdbcTemplateObject.query(StringValue.Supplier_GetNameAddDate, new RowMapper<InvoiceView>() {

				@Override
				public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceView in = new InvoiceView();
					in.setNameCus(rs.getString("nameCus"));
					in.setAddress(rs.getString("address"));
					in.setCreateDate(rs.getDate("createDate"));
					return in;
				}
	},id);
			ls.addAll(lt);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Get name address date Order");
		}
		return ls;
	}
	
	public InvoiceView getSupplier_GetTotalOrderAmount(int idSupplier){
		InvoiceView ls = new InvoiceView();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			 ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_GetTotalOrderAmount, new RowMapper<InvoiceView>() {

				@Override
				public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceView in = new InvoiceView();
					in.setTotalOrderAmount(rs.getBigDecimal("TotalOrderAmount"));
					in.setIdSupplier(rs.getInt("idSupplier"));
					return in;
				}
	}, idSupplier );
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Get Total Order Amount ");
		}
		return ls;
	} 
	
	public InvoiceView Supplier_GetTotalAmountOfProduct(int idSupplier){
		InvoiceView ls = new InvoiceView();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_GetTotalAmountOfProduct,new RowMapper<InvoiceView>() {

				@Override
				public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceView in = new InvoiceView();
					in.setTotalAmountOfProduct(rs.getBigDecimal("TotalAmountOfProduct"));
					in.setIdSupplier(rs.getInt("idSupplier"));
					return in;
				}
	}, idSupplier );
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Get Total Amount of Product");
		}
		return ls; 
	}
	
	public InvoiceView Supplier_GetRefundtoCustomers(int idSupplier){
		InvoiceView ls = new InvoiceView();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_GetRefundtoCustomers,new RowMapper<InvoiceView>() {

				@Override
				public InvoiceView mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceView in = new InvoiceView();
					in.setRefundtoCustomers(rs.getBigDecimal("RefundtoCustomers"));
					in.setIdSupplier(rs.getInt("idSupplier"));
					return in;
				}
	}, idSupplier );
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Get Refund to Customer");
		}
		return ls;
	}
	
	public InvoiceSupplier Supplier_GetMoneyReceived(int idSupplier){
		InvoiceSupplier ls = new InvoiceSupplier();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			 ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_GetMoneyReceived, new RowMapper<InvoiceSupplier>() {
				@Override
				public InvoiceSupplier mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceSupplier in = new InvoiceSupplier();
					in.setPrice(rs.getBigDecimal("price"));
					return in;
				}
			},idSupplier);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Get Money Received");
		}
		return ls;
	}
	
	public boolean Supplier_GetXacNhanDaNhanTienSupp(InvoiceSupplier modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_GetXacNhanDaNhanTienSupp,
			modelUpdate.getStatus());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println(e.getMessage());
			System.out.println("ERROR Update Supplier_GetXacNhanDaNhanTien");
		}
		return Check;
	}
	
	public InvoiceSupplier Supplier_ActionOrder(int isStatus,int status) {
		InvoiceSupplier is = new InvoiceSupplier();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			is = jdbcTemplateObject.queryForObject(StringValue.Supplier_ActionOrder, new RowMapper<InvoiceSupplier>() {
				@Override
				public InvoiceSupplier mapRow(ResultSet rs, int rowNum) throws SQLException {
					InvoiceSupplier in = new InvoiceSupplier();
					in.setSttInvoice(rs.getInt("sttInvoice"));
					in.setStatus(rs.getInt("status"));
					return in;
				}
			},isStatus,status);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Update Action Order");
		}
		return is;
	}
	
	public Voucher Supplier_GetPriceVoucher (int id, String usercreate) {
		Voucher ls = new Voucher();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			ls = jdbcTemplateObject.queryForObject(StringValue.Supplier_GetPriceVoucher, new VoucherRowMapper() {
				
			},id, String.valueOf(usercreate));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("ERROR Get Price Voucher");
		}
		return ls;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
