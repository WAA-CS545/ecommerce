/**
 * 
 */
package com.cs545.ecommerce.domain;

import java.math.BigDecimal;

/**
 * @author Ivan
 *
 */
public class OrderItem {
	private Product product;
	private long quantity;
	private BigDecimal totalPrice;
	
	
	public OrderItem() {
		super();
	}
	
	public OrderItem(Product product) {
		 this.product = product;
	     this.quantity = 1;
	     this.totalPrice = product.getUnitPrice();
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
