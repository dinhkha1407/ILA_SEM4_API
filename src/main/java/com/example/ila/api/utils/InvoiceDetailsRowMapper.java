package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.InvoiceDetails;

public class InvoiceDetailsRowMapper implements RowMapper<InvoiceDetails> {

	@Override
	public InvoiceDetails mapRow(ResultSet rs, int rowNum) throws SQLException {
		InvoiceDetails ind = new InvoiceDetails();
		ind.setId(rs.getInt("id"));
		ind.setIdInvoice(rs.getInt("idInvoice"));
		ind.setIdCart(rs.getInt("idAccount"));
		return ind;
	}
}
