package com.example.ila.api.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.models.Voucher;
import com.example.ila.api.utils.StringValue;
import com.example.ila.api.utils.VoucherRowMapper;

public class SupplierDao_Voucher implements IDataRepository<Voucher> {
	
	
	private static SupplierDao_Voucher instance = null;
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static SupplierDao_Voucher getInstance() {
		if (instance == null) {
			instance = new SupplierDao_Voucher();
		}
		return instance;
	}
	@Autowired
	
	@Override
	public boolean Insert(Voucher modelInsert) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_InsertVoucher, 
				modelInsert.getId(), modelInsert.getCondition(), modelInsert.getDiscount(), modelInsert.getUsercreate(), modelInsert.getStartDate(), modelInsert.getEndDate(), modelInsert.getIsActive());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR INSERT Voucher ");
		}
		return Check;
	}

	@Override
	public boolean Update(Voucher modelUpdate) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_UpdateVoucher,
				 modelUpdate.getCondition(), modelUpdate.getDiscount(), modelUpdate.getUsercreate(), modelUpdate.getStartDate(), modelUpdate.getEndDate(), modelUpdate.getIsActive(),modelUpdate.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Update Voucher");
		}
		return Check;
	}

	@Override
	public boolean Delete(Voucher modelDelete) {
		boolean Check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Supplier_DeleteVoucher,
			 modelDelete.getId());
			Check = true;
		} catch (Exception e) {
			Check = false;
			System.out.println("ERROR Delete Voucher ");
		}
		return Check;
	}

	@Override
	public Voucher GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Voucher> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<Voucher> GetAllVoucher(String usercreate){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> vou = jdbcTemplateObject.query(StringValue.Supplier_SelectVoucher, new VoucherRowMapper(),
					usercreate );
			ls.addAll(vou);
		} catch (Exception e) {
			System.out.println("ERROR Select Voucher");
		}
		return ls;
	}
	
	public List<Voucher> Supplier_FilterVoucher1(String usercreate){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Supplier_FilterVoucher1, new VoucherRowMapper(),usercreate);
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Filter Voucher 1");
		}
		return ls;
	}
	
	
	public List<Voucher> Supplier_FilterVoucher2(String usercreate){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Supplier_FilterVoucher2, new VoucherRowMapper(),usercreate);
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Filter Voucher 2");
		}
		return ls;
	}
	
	
	public List<Voucher> Supplier_FilterVoucher3(String usercreate){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Supplier_FilterVoucher3, new VoucherRowMapper(),usercreate);
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Filter Voucher 3");
		}
		return ls;
	}
	
	
}
