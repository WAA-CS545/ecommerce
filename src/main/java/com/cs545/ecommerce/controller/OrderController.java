/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cs545.ecommerce.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.cs545.ecommerce.domain.Category;
import com.cs545.ecommerce.service.CategoryService;

/**
 *
 * @author Solomon Kassahun
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    private CategoryService catservice;
    /**
     * @param request
     * @return
     * When user adds products to shopping cart for the first time, session id is created.
     * A redirect is then sent to the same page, but this time session id passed as parameter
     * the GET request. From now on, session id serves as orderId, as well.
     * 
     */
    @RequestMapping
    public String get(HttpServletRequest request, Model model){
        return "redirect:/order/"+request.getSession(true).getId();
    }
    
    /**
     * @param orderId
     * @param model
     * @return
     * Return order page for GET requests having session ids (serving also as orderId)
     */
    @RequestMapping(value = "/{orderId}", method = RequestMethod.GET)
    public String getOrder(@PathVariable(value = "orderId") String orderId, Model model){
       model.addAttribute("orderId", orderId);
//        List<Category> Matricescategories = catservice.getCategoriesByMainCategory("Matrices");
//		model.addAttribute("Matricescategories", Matricescategories);        		
        return "UI/jsp/order";
    }
}
