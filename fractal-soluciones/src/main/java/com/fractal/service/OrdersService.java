package com.fractal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fractal.entity.Orders;
import com.fractal.repository.IOrdersRepository;

@Service
public class OrdersService {

	@Autowired
	private IOrdersRepository ordersRepo;
	
	public Orders getOrdersById(Long ordersid) {
		return ordersRepo.findById(ordersid).get();				
	}
	
	public List<Orders> getListOrders(){
		return ordersRepo.findAll();
	}
}
