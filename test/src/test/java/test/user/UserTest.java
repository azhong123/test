package test.user;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.sys.user.mapper.UserMapper;
import com.msgcui.demo.sys.user.service.UserService;

import test.BaseTest;

public class UserTest extends BaseTest{
	
	@Autowired
	private UserService service;
	
	@Test
	public void add(){
		UserMapper user = getUser();
		service.add(user);
		UserMapper newUser = service.findById(user.getId());
		Assert.assertNotNull(newUser);
	}
	
	@Test
	public void findAll(){
		List<UserMapper> list = service.findAll();
		Assert.assertTrue(list != null && list.size()>0);
	}
	
	public UserMapper getUser(){
		UserMapper user = new UserMapper();
		user.setName("my name");
		user.setLoginName("test");
		user.setPassword("123456");
		user.setEmail("xx@qq.com");
		user.setPhone("12345678901");
		user.setDescript("this is my test");
		user.setStatus(Status.enable);
		user.setInputTime(new Date());
		user.setModifyTime(new Date());
		user.setInputUserId(1);
		user.setModifyUserId(1);
		return user;
	}

}
