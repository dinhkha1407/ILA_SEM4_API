package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.ila.api.models.Discount;

public class DiscountRowMapper implements RowMapper<Discount> {

	@Override
	public Discount mapRow(ResultSet rs, int rowNum) throws SQLException {
		Discount d = new Discount();
		d.setId(rs.getInt("id"));
		d.setDiscount(rs.getBigDecimal("discount"));
		d.setDateBegin(rs.getDate("dateBegin"));
		d.setDateEnd(rs.getDate("dateEnd"));
		d.setIdProduct(rs.getInt("idProduct"));
		d.setPriceSale(rs.getBigDecimal("priceSale"));
		d.setIsStatus(rs.getInt("isStatus"));
		return d;
	}

}
