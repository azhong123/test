package com.msgcui.demo.sys.role.mapper;

import com.msgcui.demo.base.mapper.BaseMapper;

public class RoleUserMapper extends BaseMapper{

	private int roleId;
	
	private int userId;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
}
