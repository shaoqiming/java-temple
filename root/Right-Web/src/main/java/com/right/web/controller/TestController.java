package com.right.web.controller;

import java.util.List;

import org.Right.Api.Entity.User;
import org.Right.Api.Service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	private static Logger logger=Logger.getLogger(TestController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/test.json")
	@ResponseBody
	public String test1() {
		return "test邵祺";
	}

	@RequestMapping(value = "/getUserList.json")
	@ResponseBody
	public List<User> getUserList() {
		logger.info("info");
		logger.debug("debug");
		logger.error("errot");
		return userService.getUserList();
	}

}
