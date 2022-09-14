package com.fractal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fractal.entity.Products;
import com.fractal.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService productsService;
	
	@GetMapping("/products/{productId}")
	public ResponseEntity <Products> getProductById(@PathVariable Long productId) {
		System.out.println("productId : " + productId);
		return new ResponseEntity<Products>(productsService.getProductById(productId),HttpStatus.OK);
	}
	
	@GetMapping("/products/all")
	public ResponseEntity<List<Products>> getListProducts(){
		return new ResponseEntity<List<Products>>( productsService.getAllProducts(), HttpStatus.OK);
	}
}
