package com.glen.thymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.glen.thymeleaf.service.ProductService;


@Controller
public class ProductController {
	
	private ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/")
	public String getIndex(Model model) {
		model.addAttribute("products",productService.listProducts());
		return "index";
	}
	
	
	
	@GetMapping("/product/{id}")
	public String getProductById(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("product",productService.getProduct(id));
		return "product";
	}
}
