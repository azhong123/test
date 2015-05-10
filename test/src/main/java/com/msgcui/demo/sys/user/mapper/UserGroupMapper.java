package com.msgcui.demo.sys.user.mapper;

import com.msgcui.demo.base.mapper.BaseMapper;
import com.msgcui.demo.sys.group.mapper.GroupMapper;

public class UserGroupMapper extends BaseMapper{

	
	private UserMapper user;
	
	private GroupMapper group;

	public UserMapper getUser() {
		return user;
	}

	public void setUser(UserMapper user) {
		this.user = user;
	}

	public GroupMapper getGroup() {
		return group;
	}

	public void setGroup(GroupMapper group) {
		this.group = group;
	}
	
}
