/**
 * 
 */
package com.cs545.ecommerce.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ivan
 *
 */

@Controller
public class MoreInfoController {
	
	@RequestMapping("/order")
	public String howToOrder(){
		return "order";
	}
	
	public String faq() {
		return null;
	}
	
	public String location() {
		return null;
	}
	
	public String shipping() {
		return null;
	}
	
	public String membership() {
		return null;
	}
	
}
