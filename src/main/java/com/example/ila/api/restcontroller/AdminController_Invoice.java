package com.example.ila.api.restcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ila.api.ModelView.InvoiceSupplierView;
import com.example.ila.api.repository.ILA_API_Repository;

@RestController
@RequestMapping("/Admin")
@CrossOrigin("*")
public class AdminController_Invoice {

	@GetMapping("/Chart30Days")
	public List<InvoiceSupplierView> Admin_Chart30Days(int month) {
		return ILA_API_Repository.getInstance().Admin_Chart30Days(month);
	}

	@GetMapping("/Chart12Months")
	public List<InvoiceSupplierView> Admin_Chart12Months(int year) {
		return ILA_API_Repository.getInstance().Admin_Chart12Months(year);
	}

	@GetMapping("/Total30Days")
	public List<InvoiceSupplierView> Admin_Total30Days(int month) {
		return ILA_API_Repository.getInstance().Admin_Total30Days(month);
	}

	@GetMapping("/Total12Months")
	public List<InvoiceSupplierView> Admin_Total12Months(int year) {
		return ILA_API_Repository.getInstance().Admin_Total12Months(year);
	}
	@GetMapping("/Chart30DaysYear")
	public List<InvoiceSupplierView> Admin_Chart30DaysYear(int month, int year) {
		return ILA_API_Repository.getInstance().Admin_Chart30DaysYear(month, year);
	}

	@GetMapping("/Total30DaysYear")
	public List<InvoiceSupplierView> Admin_Total30DaysYear(int month, int year) {
		return ILA_API_Repository.getInstance().Admin_Total30DaysYear(month, year);
	}
}
