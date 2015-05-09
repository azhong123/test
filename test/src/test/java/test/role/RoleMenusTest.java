package test.role;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.sys.role.mapper.RoleMenusMapper;
import com.msgcui.demo.sys.role.service.RoleMenusService;

import test.BaseTest;

public class RoleMenusTest extends BaseTest{

	@Autowired
	private RoleMenusService service;
	
	
	@Test
	public void add(){
		RoleMenusMapper roleMenus = getRoleMenus();
		service.add(roleMenus);
		RoleMenusMapper rm = service.findById(roleMenus.getId());
		Assert.assertNotNull(rm);
		
	}
	
	@Test
	public void findAll(){
		List<RoleMenusMapper> list = service.findAll();
		Assert.assertTrue(list!=null && list.size()>0);
	}
	
	
	public RoleMenusMapper getRoleMenus(){
		RoleMenusMapper roleMenus = new RoleMenusMapper();
		roleMenus.setInputTime(new Date());
		roleMenus.setInputUserId(1);
		roleMenus.setModifyTime(new Date());
		roleMenus.setModifyUserId(1);
		roleMenus.setDescript("this is test");
		roleMenus.setStatus(Status.enable);
		roleMenus.setMenusId(1);
		roleMenus.setRoleId(1);
		return roleMenus;
	}
}
