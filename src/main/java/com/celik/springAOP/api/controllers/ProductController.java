package com.celik.springAOP.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.celik.springAOP.business.responses.GetAllProductResponse;

import com.celik.springAOP.business.abstracts.ProductService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/products")
public class ProductController {
	private ProductService productService;
	
	@GetMapping()
	public List<GetAllProductResponse> getAll(){
		return productService.getAll();
	}
}
