package test.group;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.sys.user.mapper.UserGroupMapper;
import com.msgcui.demo.sys.user.service.UserGroupService;

import test.BaseTest;

public class UserGroupTest extends BaseTest{

	
	@Autowired
	private UserGroupService service;
	
	
	@Test
	public void add(){
		UserGroupMapper userGroup = getUserGroup();
		service.add(userGroup);
		UserGroupMapper nUg = service.findById(userGroup.getId());
		Assert.assertNotNull(nUg);
	}
	
	
	@Test
	public void findAll(){
		List<UserGroupMapper> list = service.findAll();
		Assert.assertTrue(list!=null && list.size()>0);
	}
	
	
	public UserGroupMapper getUserGroup(){
		UserGroupMapper userGroup = new UserGroupMapper();
		userGroup.setDescript("test");
		userGroup.setGroupId(1);
		userGroup.setInputTime(new Date());
		userGroup.setInputUserId(1);
		userGroup.setModifyTime(new Date());
		userGroup.setModifyUserId(1);
		userGroup.setUserId(1);
		userGroup.setStatus(Status.enable);
		return userGroup;
	}
	
}
