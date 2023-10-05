package com.example.ila.api.models;

public class Address {
	private int id;
	private int idAccount;
	private String address;
	private boolean status;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Address(int id, int idAccount, String address, boolean status) {
		super();
		this.id = id;
		this.idAccount = idAccount;
		this.address = address;
		this.status = status;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
