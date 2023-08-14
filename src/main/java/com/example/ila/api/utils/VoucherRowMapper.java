package com.example.ila.api.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.example.ila.api.models.Voucher;

public class VoucherRowMapper implements RowMapper<Voucher> {

	@Override
	public Voucher mapRow(ResultSet rs, int rowNum) throws SQLException {
		Voucher vou = new Voucher();
		vou.setId(rs.getString("id"));
		vou.setCoupon(rs.getString("coupon"));
		vou.setCondition(rs.getBigDecimal("condition"));
		vou.setDiscount(rs.getInt("discount"));
		vou.setUsercreate(rs.getString("usercreate"));
		vou.setStartDate(rs.getDate("startDate"));
		vou.setEndDate(rs.getDate("endDate"));
		vou.setActive(rs.getBoolean("isActive"));
		return vou;
	}

}
