package com.xywei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("/add")
	public String addProduct() {
		return "/product/add";
	}

	@RequestMapping("/delete")
	public String deleteProduct() {
		return "/product/delete";
	}

	@RequestMapping("/list")
	public String listProduct() {
		return "/product/list";
	}

	@RequestMapping("/update")
	public String updateProduct() {
		return "/product/update";
	}

}
