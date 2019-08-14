package com.xywei.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xywei.domain.User;

/**
 * 可以使用<mvc:view-controller path="/index" view-name="/index"/>代替
 * 
 * @author future
 *
 */
@Controller
public class PageController {

	/**
	 * 为了方便使用SecurityContextHolder
	 * 
	 * @return
	 */
	@RequestMapping(value = { "/", "index" })
	public String loginPage(Model model) {

		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

		if (null != principal) {
			User user = (User) principal;
			model.addAttribute("username", user.getUsername());

		}

		return "index";
	}

}
