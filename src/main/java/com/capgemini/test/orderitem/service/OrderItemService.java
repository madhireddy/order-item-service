package com.capgemini.test.orderitem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.test.orderitem.entity.OrderItem;
import com.capgemini.test.orderitem.repository.OrderItemRepository;


@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	public OrderItem createOrderItem(OrderItem orderItem) {
		
		return orderItemRepository.save(orderItem);
	}
	
	public List<OrderItem> retrieveOrderItem(){
		return orderItemRepository.findAll();
	}
}
