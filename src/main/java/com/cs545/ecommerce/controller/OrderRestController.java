/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.cs545.ecommerce.domain.Order;
import com.cs545.ecommerce.domain.OrderItem;
import com.cs545.ecommerce.domain.Product;
import com.cs545.ecommerce.service.OrderService;
import com.cs545.ecommerce.service.ProductService;

/**
 *
 * @author Solomon Kassahun
 * The objective of this controller class is to serve RESTful requests related to order
 */

@Controller
@RequestMapping(value = "rest/order")
public class OrderRestController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    /**
     * @param order
     * @return
     * POST requests having order information will trigger creation of new order.
     * Logic for creating of new order is found in: InMemoryOrderRepositoryImp -> Order create(Order) method
     */
    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody
    Order create(@RequestBody Order order) {
        return orderService.create(order);
    }

    /**
     * @param orderId
     * @return
     * Read existing order based on request parameter supplied for orderId
     */
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    public @ResponseBody
    Order read(@PathVariable(value = "orderId") String orderId) {
        return orderService.read(orderId);
    }

    /**
     * @param orderId
     * @param order
     * Update existing order with PUT HTTP request. 
     */
    @RequestMapping(value = "/{orderId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void update(@PathVariable(value = "orderId") String orderId,
            @RequestBody Order order) {
    	orderService.update(orderId, order);
    }

    /**
     * @param orderId
     * Deletes existing order
     */
    @RequestMapping(value = "/{orderId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable(value = "orderId") String orderId) {
    	orderService.delete(orderId);
    }

    /**
     * @param productId
     * @param request
     * Add order item to an existing order, considered as updating the order.
     */
    @RequestMapping(value = "/add/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void addIItem(@PathVariable String productId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Order order = orderService.read(sessionId);
        if (order == null) {
        	order = orderService.create(new Order(sessionId));
        }

        Product product = productService.getProductById(productId);
        if (product == null) {
            throw new IllegalArgumentException(String.format("Product with id (%) not found", productId));
        }

        order.addOrderItem(new OrderItem(product));
        orderService.update(sessionId, order);
    }

    /**
     * @param productId
     * @param request
     * Remove an order item from an order, considered as updating the order.
     * 
     */
    @RequestMapping(value = "/remove/{productId}", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void removeItem(@PathVariable String productId, HttpServletRequest request) {
        String sessionId = request.getSession(true).getId();
        Order order = orderService.read(sessionId);

        if (order == null) {
        	orderService.create(new Order(sessionId));
        }

        Product product = productService.getProductById(productId);
        if (product == null) {
            throw new IllegalArgumentException(String.format("Product with id (%) not found", productId));
        }

        order.removeOrderItem(new OrderItem(product));
        orderService.update(sessionId, order);
    }
}
