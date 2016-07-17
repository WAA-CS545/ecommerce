/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.repository.impl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

import com.cs545.ecommerce.domain.Order;
import com.cs545.ecommerce.repository.OrderRepository;

/**
 *
 * @author Solomon Kassahun
 */
@Repository
public class InMemoryOrderRepository implements OrderRepository {

    private Map<String, Order> orders;

    public InMemoryOrderRepository() {
        orders = new HashMap<String, Order>();
    }

    @Override
	public Order create(Order order) {
        if (orders.containsKey(order.getOrderId())) {
            throw new IllegalArgumentException(String.format(
                    "Can not create a cart. A cart with the given id (%) already exist.",
                    order.getOrderId()));
        }

        orders.put(order.getOrderId(), order);
        return order;
    }

    @Override
	public Order read(String orderId) {
        return orders.get(orderId);
    }

    @Override
	public void update(String orderId, Order updatedOrder) {
        if (!orders.containsKey(orderId)) {
            throw new IllegalArgumentException(String.format("Cannot update the order.The order with the given id(%) does not exist",
           
                    orderId));
        }
        orders.put(orderId, updatedOrder);
    }

    @Override
	public void delete(String orderId) {
        if(!orders.containsKey(orderId)){
            throw new IllegalArgumentException(String.format("Cannot delete order. The order with the given id (%) does not exist", orderId));
        }
        orders.remove(orderId);
    }

}
