package test.role;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.sys.role.mapper.RoleMapper;
import com.msgcui.demo.sys.role.service.RoleService;

import test.BaseTest;

public class RoleTest extends BaseTest{
	
	@Autowired
	private RoleService service;

	@Test
	public void add(){
		RoleMapper role = getRole();
		service.add(role);
		RoleMapper newRole = service.findById(role.getId());
		Assert.assertNotNull(newRole);
	}
	
	@Test
	public void findAll(){
		List<RoleMapper> list = service.findAll();
		Assert.assertTrue(list!=null && list.size()>0);
	}
	
	
	public RoleMapper getRole(){
		RoleMapper role = new RoleMapper();
		role.setDescript("this is test");
		role.setInputTime(new Date());
		role.setInputUserId(1);
		role.setName("test");
		role.setStatus(Status.enable);
		role.setModifyTime(new Date());
		return role;
	}
	
}
