package com.msgcui.demo.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msgcui.demo.user.dao.UserDao;
import com.msgcui.demo.user.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserDao dao;
	
	public void findAll(){
		List<UserMapper> list = dao.findAll();
		System.out.println("查询结果："+list.size());
	}


}
