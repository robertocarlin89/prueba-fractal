package com.fractal.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fractal.entity.Clients;

@Repository
public interface IClientsRepository extends CrudRepository<Clients, Long>{

	public List<Clients> findByNames(String name);
		
	public List<Clients> findAll();
	
}
