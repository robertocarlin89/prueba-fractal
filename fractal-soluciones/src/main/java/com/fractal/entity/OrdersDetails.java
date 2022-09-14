package com.fractal.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.ForeignKey;

@Entity
@Table(name="orders_details")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class OrdersDetails {

	@Id
	@Column(name="orders_det_id")
	private Long ordersDetId;
	
	@Column(name= "orders_id")
	private Long ordersId;
	
	@Column(name = "product_id")
	private Long productId;
	private Integer quantity;
	private Double cost;
	private String state;
	
	/*@ManyToOne(fetch = FetchType.)
	@JoinColumn(foreignKey = @ForeignKey(name = "orders_id"), name="orders_id", insertable = false, updatable = false)
	private Orders order;*/
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="product_id", referencedColumnName = "product_id" , insertable = false, updatable = false)
	private Products products;
	
	

	public Products getProducts() {
		return products;
	}
	public void setProducts(Products products) {
		this.products = products;
	}
	public Long getOrdersDetId() {
		return ordersDetId;
	}
	public void setOrdersDetId(Long ordersDetId) {
		this.ordersDetId = ordersDetId;
	}

	public Long getOrdersId() {
		return ordersId;
	}
	public void setOrdersId(Long ordersId) {
		this.ordersId = ordersId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	
}
