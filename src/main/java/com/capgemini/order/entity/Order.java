package com.capgemini.order.entity;

import java.time.LocalDate;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order")
public class Order {

	@Id
	private int orderid;
	private float ordertotal;
	private LocalDate orderdate;
	private int customerId;
	private String status;
	private Set<LineItem> lineItem;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int orderid, float ordertotal, LocalDate orderdate, int customerId, String status,
			Set<LineItem> lineItem) {
		super();
		this.orderid = orderid;
		this.ordertotal = ordertotal;
		this.orderdate = orderdate;
		this.customerId = customerId;
		this.status = status;
		this.lineItem = lineItem;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public float getOrdertotal() {
		return ordertotal;
	}

	public void setOrdertotal(float ordertotal) {
		this.ordertotal = ordertotal;
	}

	public LocalDate getOrderdate() {
		return orderdate;
	}

	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<LineItem> getLineItem() {
		return lineItem;
	}

	public void setLineItem(Set<LineItem> lineItem) {
		this.lineItem = lineItem;
	}

	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", ordertotal=" + ordertotal + ", orderdate=" + orderdate + ", customerId="
				+ customerId + ", status=" + status + ", lineItem=" + lineItem + "]";
	}
	
	
	
}
