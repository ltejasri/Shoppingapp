package com.capgemini.order.service;

import java.util.List;
import java.util.Set;

import com.capgemini.order.entity.LineItem;
import com.capgemini.order.entity.Order;
import com.capgemini.order.exception.OrderNotFoundException;

public interface OrderService {

	/*public void addLineItem(LineItem item, int customerId);

	public void removeLineItem(LineItem item, int customerId);

	public Set<LineItem> getLineItems(int customerId);*/
	
	public List<Order> getOrders();

	public Order getOrder(int orderId) throws OrderNotFoundException;

	public Order submitOrder(Order order);

	public void cancelOrder(int orderId) throws OrderNotFoundException;

	public void deleteOrder(int orderId) throws OrderNotFoundException;

}
