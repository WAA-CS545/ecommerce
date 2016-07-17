/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs545.ecommerce.domain.Order;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.repository.OrderRepository;
import com.cs545.ecommerce.repository.ProductRepository;
import com.cs545.ecommerce.service.OrderService;

/**
 *
 * @author Solomon Kassahun
 */
@Service
public class OrderServiceImpl implements OrderService{
    
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ProductRepository productRepository; 
    
    @Override
	public Order create(Order order) {
        return orderRepository.create(order);
    }

    @Override
	public Order read(String orderId) {
        return orderRepository.read(orderId);
    }

    @Override
	public void update(String orderId, Order order) {
    	orderRepository.update(orderId, order);
    }

    @Override
	public void delete(String orderId) {
    	orderRepository.delete(orderId);
    }
    @Override
	public void processOrder(String productId, int quantity) {
        Product orderdProduct = productRepository.getProductById(productId);

        if (orderdProduct != null) {
            if (quantity < orderdProduct.getUnitsInStock()) {
                orderdProduct.setUnitsInStock(
                        orderdProduct.getUnitsInStock() - quantity);
            } else {
                throw new IllegalArgumentException(String.format("Order quantity "
                        + "is greater than or equal to availabe quantity %d", 
                        orderdProduct.getUnitsInStock()));
            }
        }
    }
    
}
