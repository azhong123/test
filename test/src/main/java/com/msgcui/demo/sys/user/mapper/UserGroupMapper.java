package com.msgcui.demo.sys.user.mapper;

import com.msgcui.demo.base.mapper.BaseMapper;

public class UserGroupMapper extends BaseMapper{

	
	private int userId;
	
	private int groupId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	
}
