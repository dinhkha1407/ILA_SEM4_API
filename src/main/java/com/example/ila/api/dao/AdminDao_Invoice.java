package com.example.ila.api.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.ModelView.InvoiceSupplierView;
import com.example.ila.api.config.DatabaseConnect;
import com.example.ila.api.interfaces.IDataRepository;
import com.example.ila.api.utils.StringValue;

public class AdminDao_Invoice implements IDataRepository<InvoiceSupplierView> {
	private static AdminDao_Invoice instance = null;

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	public static AdminDao_Invoice getInstance() {
		if (instance == null) {
			instance = new AdminDao_Invoice();
		}
		return instance;
	}

	@Autowired
	@Override
	public boolean Insert(InvoiceSupplierView modelInsert) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Update(InvoiceSupplierView modelUpdate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean Delete(InvoiceSupplierView modelDelete) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public InvoiceSupplierView GetById(Integer idModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<InvoiceSupplierView> GetAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<InvoiceSupplierView> Admin_Chart30Days(int month) {
		List<InvoiceSupplierView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceSupplierView> inv = jdbcTemplateObject.query(StringValue.Admin_Chart30Days,
					new RowMapper<InvoiceSupplierView>() {

						@Override
						public InvoiceSupplierView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceSupplierView in = new InvoiceSupplierView();
							in.setTotal(rs.getBigDecimal("total"));
							in.setDate(rs.getDate("date"));
							return in;
						}

					}, month);
			ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Admin_Chart30Days");
		}
		return ls;
	}

	public List<InvoiceSupplierView> Admin_Chart12Months(int year) {
		List<InvoiceSupplierView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceSupplierView> inv = jdbcTemplateObject.query(StringValue.Admin_Chart12Months,
					new RowMapper<InvoiceSupplierView>() {
						@Override
						public InvoiceSupplierView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceSupplierView in = new InvoiceSupplierView();
							in.setTotal(rs.getBigDecimal("total"));
							in.setMonth(rs.getInt("month"));
							return in;
						}
					}, year);
			ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Admin_Chart12Months");
		}
		return ls;
	}

	public List<InvoiceSupplierView> Admin_Total30Days(int month) {
		List<InvoiceSupplierView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceSupplierView> inv = jdbcTemplateObject.query(StringValue.Admin_Total30Days,
					new RowMapper<InvoiceSupplierView>() {

						@Override
						public InvoiceSupplierView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceSupplierView in = new InvoiceSupplierView();
							in.setIdInvoice(rs.getInt("idInvoice"));
							in.setDiscount(rs.getInt("discount"));
							in.setCondition(rs.getBigDecimal("condition"));
							in.setTotalInvoice(rs.getBigDecimal("totalInvoice"));
							in.setiLAPay(rs.getBigDecimal("iLAPay"));
							in.setAmountReceived(rs.getBigDecimal("amountReceived"));
							in.setTotalA(rs.getBigDecimal("totalA"));
							in.setDateInvoice(rs.getDate("dateInvoice"));
							return in;
						}

					}, month);
			ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Admin_Total30Days");
		}
		return ls;
	}

	public List<InvoiceSupplierView> Admin_Total12Months(int year) {
		List<InvoiceSupplierView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceSupplierView> inv = jdbcTemplateObject.query(StringValue.Admin_Total12Months,
					new RowMapper<InvoiceSupplierView>() {

						@Override
						public InvoiceSupplierView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceSupplierView in = new InvoiceSupplierView();
							in.setIdInvoice(rs.getInt("idInvoice"));
							in.setDiscount(rs.getInt("discount"));
							in.setCondition(rs.getBigDecimal("condition"));
							in.setTotalInvoice(rs.getBigDecimal("totalInvoice"));
							in.setiLAPay(rs.getBigDecimal("iLAPay"));
							in.setAmountReceived(rs.getBigDecimal("amountReceived"));
							in.setTotalA(rs.getBigDecimal("totalA"));
							in.setDateInvoice(rs.getDate("dateInvoice"));
							return in;
						}

					}, year);
			ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Admin_Total12Months");
		}
		return ls;
	}

	public List<InvoiceSupplierView> Admin_Chart30DaysYear(int month, int year) {
		List<InvoiceSupplierView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceSupplierView> inv = jdbcTemplateObject.query(StringValue.Admin_Chart30DaysYear,
					new RowMapper<InvoiceSupplierView>() {

						@Override
						public InvoiceSupplierView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceSupplierView in = new InvoiceSupplierView();
							in.setTotal(rs.getBigDecimal("total"));
							in.setDate(rs.getDate("date"));
							return in;
						}

					}, month,year);
			ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Admin_Chart30DaysYear");
		}
		return ls;
	}

	public List<InvoiceSupplierView> Admin_Total30DaysYear(int month, int year) {
		List<InvoiceSupplierView> ls = new ArrayList<>();
		try {
			jdbcTemplateObject = new JdbcTemplate(DatabaseConnect.getInstance().dbDataSource());
			List<InvoiceSupplierView> inv = jdbcTemplateObject.query(StringValue.Admin_Total30DaysYear,
					new RowMapper<InvoiceSupplierView>() {

						@Override
						public InvoiceSupplierView mapRow(ResultSet rs, int rowNum) throws SQLException {
							InvoiceSupplierView in = new InvoiceSupplierView();
							in.setIdInvoice(rs.getInt("idInvoice"));
							in.setDiscount(rs.getInt("discount"));
							in.setCondition(rs.getBigDecimal("condition"));
							in.setTotalInvoice(rs.getBigDecimal("totalInvoice"));
							in.setiLAPay(rs.getBigDecimal("iLAPay"));
							in.setAmountReceived(rs.getBigDecimal("amountReceived"));
							in.setTotalA(rs.getBigDecimal("totalA"));
							in.setDateInvoice(rs.getDate("dateInvoice"));
							return in;
						}

					}, month,year);
			ls.addAll(inv);
		} catch (Exception e) {
			System.out.println("ERROR Admin_Total30DaysYear");
		}
		return ls;
	}
}
