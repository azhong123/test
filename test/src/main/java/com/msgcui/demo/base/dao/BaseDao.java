package com.msgcui.demo.base.dao;

import java.util.List;

public interface BaseDao<T> {

	public void add(T t);
	
	public void update(T t);
	
	public T findById(int id);
	
	public List<T> findAll();
	
	public List<T> pagination(int number,int size,T t);
	
	
}
