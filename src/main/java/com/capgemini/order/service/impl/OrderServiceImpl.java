package com.capgemini.order.service.impl;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.order.entity.LineItem;
import com.capgemini.order.entity.Order;
import com.capgemini.order.exception.OrderNotFoundException;
import com.capgemini.order.repository.OrderRepository;
import com.capgemini.order.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	 OrderRepository orderRepository;
	
	private HashMap<Integer, Set<LineItem>> itemCart = new HashMap<>();

	@Override
	public void addLineItem(LineItem item, int customerId) {
		Set<LineItem> tempSet = itemCart.get(customerId);
		if (tempSet == null) {
			tempSet = new HashSet<>();
			tempSet.add(item);
			itemCart.put(customerId, tempSet);
		} else {
			tempSet.add(item);
			itemCart.put(customerId, tempSet);
		}		
	}

	@Override
	public void removeLineItem(LineItem item, int customerId) {
		Set<LineItem> tempSet = itemCart.get(customerId);
		if (tempSet != null) {
			tempSet.remove(item);
			itemCart.put(customerId, tempSet);
		}		
	}

	@Override
	public Set<LineItem> getLineItems(int customerId) {
		Set<LineItem> tempSet = itemCart.get(customerId);
		return tempSet;
	}
	

	@Override
	public Set<Order> getOrders(int customerId) throws OrderNotFoundException {
		return null;
	}

	@Override
	public Order getOrder(int orderId) throws OrderNotFoundException {
		return null;
	}

	@Override
	public Order submitOrder(Order order) {
	//	order.setLineItem(itemCart.get(order.getCustomerId()));
		order.setOrderdate(LocalDate.now());
		return orderRepository.save(order);
	}

	@Override
	public void cancelOrder(int orderId) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteOrder(Order order) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		
	}
	
	
}
