package com.fractal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fractal.entity.OrdersDetails;

@Repository
public interface IOrdersDetailsRepository  extends CrudRepository<OrdersDetails, Long> {

}
