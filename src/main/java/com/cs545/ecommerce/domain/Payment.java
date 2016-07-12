/**
 * 
 */
package com.cs545.ecommerce.domain;


import java.math.BigDecimal;

/**
 * @author Ivan
 *
 */
public class Payment {
	private User user;
	private Order order;
	private BigDecimal totalPrice;
	
	public Payment() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	
}
