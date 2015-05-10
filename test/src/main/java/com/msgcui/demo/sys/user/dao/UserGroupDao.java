package com.msgcui.demo.sys.user.dao;

import java.util.List;

import com.msgcui.demo.base.dao.BaseDao;
import com.msgcui.demo.sys.user.mapper.UserGroupMapper;

public interface UserGroupDao extends BaseDao<UserGroupMapper>{
	
	/**
	 * 根据组ID查询
	 * @param groupId
	 * @return
	 */
	public List<UserGroupMapper> findByGroupId(int groupId);
	/**
	 * 根据用户ID查询
	 * @param userId
	 * @return
	 */
	public List<UserGroupMapper> findByUserId(int userId);

}
