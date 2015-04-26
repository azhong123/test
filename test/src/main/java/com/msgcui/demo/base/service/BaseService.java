package com.msgcui.demo.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.dao.BaseDao;

public class BaseService<T,D extends BaseDao<T>> {

	@Autowired
	private D d;
	
	public void add(T t){
		d.add(t);
	}
	
	public void update(T t){
		d.update(t);
	}
	
	public T findById(int id){
		return d.findById(id);
	}
	
	public List<T> findAll(){
		return d.findAll();
	}
	
	public List<T> pagination(int number,int size,T t){
		return d.pagination(number, size, t);
	}
	
}
