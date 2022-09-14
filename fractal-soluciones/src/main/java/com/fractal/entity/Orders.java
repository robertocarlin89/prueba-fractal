package com.fractal.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Orders {

	@Id
	@Column(name = "orders_id")
	private Long ordersId;
	@Column(name = "client_id")
	private Long clientId;
	@Column(name = "date_orders")
	private Date dateOrders;
	
	@OneToMany( cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="orders_id", referencedColumnName = "orders_id")
	private List<OrdersDetails> ordersDetails;
	
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="client_id", referencedColumnName = "clients_id" , insertable = false, updatable = false)
	private Clients clients;
	
	private String state;

	
	
	public Clients getClients() {
		return clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	public List<OrdersDetails> getOrdersDetails() {
		return ordersDetails;
	}

	public void setOrdersDetails(List<OrdersDetails> ordersDetails) {
		this.ordersDetails = ordersDetails;
	}

	public Long getOrdersId() {
		return ordersId;
	}

	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public Date getDateOrders() {
		return dateOrders;
	}

	public void setDateOrders(Date dateOrders) {
		this.dateOrders = dateOrders;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Orders [ordersId=" + ordersId + ", clientId=" + clientId + ", dateOrders=" + dateOrders + ", state="
				+ state + "]";
	}
	
	
}
