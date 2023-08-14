package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.InvoiceSupplier;

public class InvoiceSupplierRowMapper implements RowMapper<InvoiceSupplier> {

	@Override
	public InvoiceSupplier mapRow(ResultSet rs, int rowNum) throws SQLException {
		InvoiceSupplier ins = new InvoiceSupplier();
		ins.setId(rs.getInt("id"));
		ins.setIdInvoice(rs.getInt("idInvoice"));
		ins.setPriceVoucherA(rs.getBigDecimal("priceVoucherA"));
		ins.setAmountReceived(rs.getBigDecimal("amountReceived"));
		ins.setTotalA(rs.getBigDecimal("totalA"));
		ins.setTotalS(rs.getBigDecimal("totalS"));
		return ins;
	}

}
