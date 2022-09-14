package com.fractal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fractal.entity.Orders;
import com.fractal.service.OrdersService;

@RestController
public class OrdersController {
	
	@Autowired
	private OrdersService ordersService;
	
	
	@GetMapping("/orders/{orderId}")
	public ResponseEntity <Orders> getOrderById(@PathVariable Long orderId) {
		System.out.println("ordersId : " + orderId);
		return new ResponseEntity<Orders>(ordersService.getOrdersById(orderId),HttpStatus.OK);
	}
	
	@GetMapping("/orders/all")
	public List<Orders> getAllOrders(){
		return ordersService.getListOrders();
	}
	
	
}
