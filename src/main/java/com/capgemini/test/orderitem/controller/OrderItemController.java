package com.capgemini.test.orderitem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.test.orderitem.entity.OrderItem;
import com.capgemini.test.orderitem.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	private OrderItemService orderItemService;

	@PostMapping("/createOrder")
	public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {

		return orderItemService.createOrderItem(orderItem);

	}
	
	@GetMapping("/retrevieOrderItem")
	public List<OrderItem> retrevieOrderItem(){
		return orderItemService.retrieveOrderItem();
	}

}
