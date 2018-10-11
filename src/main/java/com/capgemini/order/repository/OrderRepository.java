package com.capgemini.order.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.capgemini.order.entity.Order;

public interface OrderRepository extends MongoRepository<Order, Integer>{

	@Query("{'status' : {$ne : 'deleted'}}")
	public List<Order> find();
	
	

}
