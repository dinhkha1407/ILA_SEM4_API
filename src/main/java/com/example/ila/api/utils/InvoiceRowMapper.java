package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Invoice;

public class InvoiceRowMapper implements RowMapper<Invoice> {

	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Invoice inv = new Invoice();
		inv.setId(rs.getInt("id"));
		inv.setIdAccount(rs.getInt("idAccount"));
		inv.setAddress(rs.getString("address"));
		inv.setNotes(rs.getString("notes"));
		inv.setTotalPrice(rs.getBigDecimal("totalPrice"));
		inv.setIdPayment(rs.getString("idPayment"));
		inv.setIdVoucherS(rs.getString("idVoucherS"));
		inv.setIdVoucherA(rs.getString("idVoucherA"));
		inv.setCreateDate(rs.getDate("createDate"));
		inv.setIsStatus(rs.getInt("isStatus")); 
		return inv;
	}

}
