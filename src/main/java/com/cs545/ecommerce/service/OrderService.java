/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.service;

import com.cs545.ecommerce.domain.Order;

import edu.mum.waa.webstore.domain.Cart;

/**
 *
 * @author Solomon Kassahun
 */
public interface OrderService {
    Order create(Order order);
    Order read(String orderId);
    void update(String orderId, Order order);
    void delete(String orderId);
    public void processOrder(String productId, int quantity);
}
