package com.fractal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fractal.entity.Products;

@Repository
public interface IProductsRepository extends CrudRepository<Products, Long>{

	public List<Products> findByName(String names);
	
	public Optional<Products> findByProductId(Long id);
	
	public List<Products> findAll();
}

