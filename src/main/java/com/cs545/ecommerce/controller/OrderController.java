/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Solomon Kassahun
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {
    
    @RequestMapping
    public String get(HttpServletRequest request){
        return "redirect:/order/"+request.getSession(true).getId();
    }
    
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    public String getCart(@PathVariable(value = "orderId") String orderId, Model model){
        model.addAttribute("orderId", orderId);
        return "order";
    }
}
