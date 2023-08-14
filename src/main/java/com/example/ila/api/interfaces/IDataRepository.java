package com.example.ila.api.interfaces;

import java.util.List;

public interface IDataRepository <T>{
	public boolean Insert(T modelInsert);
	//
	public boolean Update(T modelUpdate);
	//
	public boolean Delete(T modelDelete);
	//
	public T GetById(Integer idModel);
	//
	public List<T> GetAll();
	

}
