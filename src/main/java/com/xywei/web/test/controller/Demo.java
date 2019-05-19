package com.xywei.web.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xywei.domain.UserTest;
import com.xywei.service.TestService;

@Controller
public class Demo {

	@Autowired
	private TestService testServiceImpl;

	@RequestMapping("test")
	public String toTest(Model model) {
		testServiceImpl.test();
		model.addAttribute("model", "model");
		return "test";
	}

	@RequestMapping("userTest")
	public String toTest2(Model model) {
		UserTest userTest = testServiceImpl.getUserTest();
		model.addAttribute("model", userTest);
		return "test";
	}

}
