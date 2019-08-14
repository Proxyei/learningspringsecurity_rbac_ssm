package com.xywei.controller;

import org.springframework.stereotype.Controller;

/**
 * 可以使用<mvc:view-controller path="/index" view-name="/index"/>代替
 * 
 * @author future
 *
 */
@Controller
public class PageController {

//	@RequestMapping(value = { "/", "index" })
	public String loginPage() {

		return "login";
	}

}
