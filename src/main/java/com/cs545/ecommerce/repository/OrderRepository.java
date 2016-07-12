/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.repository;

import com.cs545.ecommerce.domain.Order;



/**
 *
 * @author Solomon Kassahun
 */
public interface OrderRepository {
    Order create(Order order);
    Order read(String orderId);
    void update(String orderId, Order updatedOrder);
    void delete(String orderId);
}
