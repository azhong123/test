package test.group;

import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.msgcui.demo.base.constant.Status;
import com.msgcui.demo.sys.group.mapper.GroupMapper;
import com.msgcui.demo.sys.group.service.GroupService;

import test.BaseTest;

public class GroupTest extends BaseTest{

	
	@Autowired
	private GroupService service;
	
	
	@Test
	public void add(){
		GroupMapper group = getGroup();
		service.add(group);
		GroupMapper nGroup = service.findById(group.getId());
		Assert.assertNotNull(nGroup);
		
	}
	
	
	@Test
	public void findAll(){
		List<GroupMapper> list = service.findAll();
		Assert.assertTrue(list!=null && list.size()>0);
	}
	
	
	public GroupMapper getGroup(){
		GroupMapper group = new GroupMapper();
		group.setName("test");
		group.setDescript("test");
		group.setInputTime(new Date());
		group.setInputUserId(1);
		group.setModifyTime(new Date());
		group.setModifyUserId(1);
		group.setStatus(Status.enable);
		return group;
	}
	
}
