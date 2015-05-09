package test.menus;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.sys.menus.mapper.MenusMapper;
import com.msgcui.demo.sys.menus.service.MenusService;

import test.BaseTest;

public class MenusTest extends BaseTest{

	@Autowired
	private MenusService service;
	
	@Test
	public void add(){
		MenusMapper menus = getMenus();
		service.add(menus);
		MenusMapper newMenus = service.findById(menus.getId());
		Assert.assertNotNull(newMenus);
	}
	
	@Test
	public void findAll(){
		List<MenusMapper> list = service.findAll();
		Assert.assertTrue(list!=null && list.size()>0);
	}
	
	public MenusMapper getMenus(){
		MenusMapper menus = new MenusMapper();
		menus.setName("菜单");
		menus.setPath("http://www.baidu.com");
		menus.setInputTime(new Date());
		menus.setInputUserId(1);
		menus.setModifyTime(new Date());
		menus.setModifyUserId(1);
		menus.setDescript("this is test");
		menus.setStatus(Status.enable);
		menus.setMenuId(-1);
		return menus;
	}
}
