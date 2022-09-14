package com.fractal.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fractal.entity.Orders;

@Repository
public interface IOrdersRepository extends CrudRepository<Orders, Long> {

	public Optional<Orders> findByOrdersId(Long ordersId);
	
	public List<Orders> findByState(String state);
	public List<Orders> findAll();
}
