package com.capgemini.order.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.order.entity.LineItem;
import com.capgemini.order.entity.Order;
import com.capgemini.order.exception.OrderNotFoundException;
import com.capgemini.order.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	
	 /* @PostMapping("/order") public ResponseEntity<LineItem>
	  addLineItem(@RequestBody LineItem item, int customerId) {
	  orderService.addLineItem(item, customerId); return new
	  ResponseEntity<>(HttpStatus.OK); }
	  
	  @GetMapping("/order") public ResponseEntity<Set<LineItem>> getLineItems( int
	  customerId) { Set<LineItem> tempSet = orderService.getLineItems(customerId);
	  return new ResponseEntity<Set<LineItem>>(tempSet, HttpStatus.OK); }
	  
	  @DeleteMapping("/order") public ResponseEntity<Set<LineItem>> removeLineItem(
	  int customerId, @RequestBody LineItem item) {
	  orderService.removeLineItem(item, customerId); return new
	  ResponseEntity<>(HttpStatus.OK); }
*/	 

	@PostMapping("/submitorder")
	public ResponseEntity<Order> submitOrder(@RequestBody Order order) {
		return new ResponseEntity<Order>(orderService.submitOrder(order), HttpStatus.OK);
	}

	@PutMapping("/cancel/{orderId}")
	public void cancelOrder(@PathVariable int orderId) throws OrderNotFoundException {
		orderService.cancelOrder(orderId);
	}

	@PutMapping("/delete/{orderId}")
	public void deleteOrder(@PathVariable int orderId) throws OrderNotFoundException {
		orderService.deleteOrder(orderId);
	}
	
	@GetMapping("/findAllOrders")
	public ResponseEntity<List<Order>> findAllOrders(){
		return new ResponseEntity<List<Order>>(orderService.getOrders(), HttpStatus.OK);
	}
	
	
	
}
