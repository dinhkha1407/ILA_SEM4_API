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

public class AdminDao_Voucher implements IDataRepository<Voucher> {
private static AdminDao_Voucher instance = null;
	
	@Autowired
	private  JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Voucher getInstance() {
		if (instance == null) {
			instance = new AdminDao_Voucher();
		}
		return instance;
	}
	@Autowired
	
	@Override
	public boolean Insert(Voucher modelInsert) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_InsertVoucher, modelInsert.getId(), modelInsert.getCondition(), modelInsert.getDiscount(), modelInsert.getUsercreate(), modelInsert.getStartDate(), modelInsert.getEndDate(),modelInsert.getIsActive());
			 check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Insert Voucher Admin");
		}
		return check;
	}

	@Override
	public boolean Update(Voucher modelUpdate) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_UpdateVoucher, modelUpdate.getCondition(), modelUpdate.getDiscount(), modelUpdate.getStartDate(), modelUpdate.getEndDate(), modelUpdate.getIsActive());
			 check = true;
		} catch (Exception e) {
			check = false;
			System.out.println("ERROR Update Voucher Admin");
		}
		return check;
	}

	@Override
	public boolean Delete(Voucher modelDelete) {
		boolean check = false;
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			jdbcTemplateObject.update(StringValue.Admin_DeleteVoucher,modelDelete.getId());
			check = true;
		} catch (Exception e) {
			check = false;
			System.out.println(e.getMessage());
			System.out.println("ERROR Delete Voucher Admin");
		}
		return check;
	}


	@Override
	public Voucher GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public List<Voucher> GetAll() {
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Admin_GetVoucher, new VoucherRowMapper());
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Get Voucher Admin");
		}
		return ls;
	}
	
	
	public Voucher Admin_CheckVoucherExist(int id) {
		Voucher v = new Voucher();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			v = jdbcTemplateObject.queryForObject(StringValue.Admin_CheckVoucherExist, new VoucherRowMapper(),id);
		} catch (Exception e) {
			System.out.println("ERROR Check Exist Voucher Admin");
		}
		return v;
	}
	
	public List<Voucher> Admin_FilterVoucher1(){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Admin_FilterVoucher1, new VoucherRowMapper());
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Filter Voucher Admin");
		}
		return ls;
	}
	
	public List<Voucher> Admin_FilterVoucher2(){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Admin_FilterVoucher2, new VoucherRowMapper());
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Filter Voucher Admin");
		}
		return ls;
	}
	
	public List<Voucher> Admin_FilterVoucher3(){
		List<Voucher> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<Voucher> v = jdbcTemplateObject.query(StringValue.Admin_FilterVoucher3, new VoucherRowMapper());
			ls.addAll(v);
		} catch (Exception e) {
			System.out.println("ERROR Filter Voucher Admin");
		}
		return ls;
	}
	
	public Voucher Admin_GetIDVoucher(int id) {
		Voucher v = new Voucher();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			v = jdbcTemplateObject.queryForObject(StringValue.Admin_GetIDVoucher, new VoucherRowMapper(),id);
		} catch (Exception e) {
			System.out.println("ERROR GET ID Voucher Admin");
		}
		return v;
	}
	
	
	
}
