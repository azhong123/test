package com.msgcui.demo.sys.role.mapper;

import com.msgcui.demo.base.mapper.BaseMapper;

public class RoleMenusMapper extends BaseMapper{

	private int roleId;
	
	private int menusId;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getMenusId() {
		return menusId;
	}

	public void setMenusId(int menusId) {
		this.menusId = menusId;
	}
	
}
