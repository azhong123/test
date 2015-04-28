package com.msgcui.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.msgcui.demo.user.service.UserService;

@Controller
@RequestMapping("/demo")
public class TestController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public String test(){
		service.findAll();
		System.out.println("test");
		return "test";
	}
	
	@RequestMapping(value="/remote",method=RequestMethod.POST)
	@ResponseBody
	public String test1(String remote){
		System.out.println(remote);
		return "true";
	}

}
