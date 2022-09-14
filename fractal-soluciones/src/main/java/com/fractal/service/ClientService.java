package com.fractal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fractal.entity.Clients;
import com.fractal.repository.IClientsRepository;

@Service
public class ClientService {

	@Autowired
	private IClientsRepository clientsRepo;
	
	public Clients getClientsByName(String names){
		List<Clients> listClients= clientsRepo.findByNames(names);
		return listClients.stream().findAny().get();
	}
	
	public List<Clients> getListClients(){
		return clientsRepo.findAll();
	}
}
