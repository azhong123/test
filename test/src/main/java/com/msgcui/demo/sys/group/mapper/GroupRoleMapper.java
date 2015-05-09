package com.msgcui.demo.sys.group.mapper;

import com.msgcui.demo.base.mapper.BaseMapper;

public class GroupRoleMapper extends BaseMapper{

	private int groupId;
	
	private int roleId;

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	
}
