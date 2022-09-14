package com.fractal.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Clients {

	@Id
	@Column(name = "clients_id")
	private Long clientsId;
	private String names;
	private String state;
	public Long getClientsId() {
		return clientsId;
	}
	public void setClientsId(Long clientsId) {
		this.clientsId = clientsId;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	
}
