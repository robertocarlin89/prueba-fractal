package com.fractal.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fractal.entity.Products;
import com.fractal.repository.IProductsRepository;

@Service
public class ProductsService {

	@Autowired
	private IProductsRepository productsRepo;
	
	public Products getProductById(Long id){
		return productsRepo.findByProductId(id).get();
	}
	
	public List<Products> getAllProducts(){
		return productsRepo.findAll();
	}
}
