package com.capgemini.test.orderitem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.test.orderitem.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

}
