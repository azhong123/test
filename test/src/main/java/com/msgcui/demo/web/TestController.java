package com.msgcui.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.msgcui.demo.sys.user.service.UserGroupService;
import com.msgcui.demo.sys.user.service.UserService;


@Controller
@RequestMapping("/demo")
public class TestController {
	
	@Autowired
	private UserService service;
	@Autowired
	private UserGroupService ugService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String test(){
		/**
		 * 1. 根据当前登录用户获取用户组
		 */
		
		return "index";
	}
	
	@RequestMapping(value="/remote",method=RequestMethod.POST)
	@ResponseBody
	public String test1(String remote){
		System.out.println(remote);
		return "true";
	}

}
