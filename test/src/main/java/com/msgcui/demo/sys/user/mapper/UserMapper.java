package com.msgcui.demo.sys.user.mapper;

import java.util.List;

import com.msgcui.demo.base.mapper.BaseMapper;
import com.msgcui.demo.sys.group.mapper.GroupMapper;


public class UserMapper extends BaseMapper{

	private String name;
	
	private String loginName;
	
	private String password;
	
	private String email;
	
	private String phone;
	
	private List<GroupMapper> groupList;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<GroupMapper> getGroupList() {
		return groupList;
	}

	public void setGroupList(List<GroupMapper> groupList) {
		this.groupList = groupList;
	}
	
	
}
