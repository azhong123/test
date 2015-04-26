package test.role;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.role.mapper.RoleUserMapper;
import com.msgcui.demo.role.service.RoleUserService;

import test.BaseTest;

public class RoleUserTest extends BaseTest{
	
	@Autowired
	private RoleUserService service;
	
	
	@Test
	public void add(){
		RoleUserMapper roleUser = getRoleUser();
		service.add(roleUser);
		RoleUserMapper rm = service.findById(roleUser.getId());
		Assert.assertNotNull(rm);
	}
	
	
	@Test
	public void findAll(){
		List<RoleUserMapper> list = service.findAll();
		Assert.assertTrue(list!=null && list.size()>0);
	}
	
	
	public RoleUserMapper getRoleUser(){
		RoleUserMapper roleUser = new RoleUserMapper();
		roleUser.setDescript("this is test");
		roleUser.setInputTime(new Date());
		roleUser.setInputUserId(1);
		roleUser.setModifyTime(new Date());
		roleUser.setModifyUserId(1);
		roleUser.setStatus(Status.enable);
		roleUser.setUserId(1);
		roleUser.setRoleId(1);
		return roleUser;
	}

}
