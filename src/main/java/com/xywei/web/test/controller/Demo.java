package com.xywei.web.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo {

	@RequestMapping("test")
	public String toTest(Model model) {
		model.addAttribute("model", "model");
		return "test";
	}
}
