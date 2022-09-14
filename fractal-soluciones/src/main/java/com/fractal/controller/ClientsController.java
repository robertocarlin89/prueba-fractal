package com.fractal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.fractal.entity.Clients;
import com.fractal.service.ClientService;

@RestController
public class ClientsController {

	@Autowired
	private ClientService clientService;
	
	@GetMapping("/clients/{name}")
	public ResponseEntity <Clients> getClientsByName(@PathVariable String name) {
		System.out.println("Names : " + name);
		return new ResponseEntity<Clients>(clientService.getClientsByName(name),HttpStatus.OK);
	}
	
	@GetMapping("/clients/all")
	public List<Clients> getAllclients(){
		return clientService.getListClients();
	}
}
