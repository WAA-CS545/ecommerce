/**
 * 
 */
package com.cs545.ecommerce.domain;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Solomon Kassahun
 *
 */

public class Order {
	private String orderId;
	private LocalDate orderDate;
	private User user;
	private BigDecimal orderPrice;
	private Map<String, OrderItem> orderItems;
	
	/**
	 * Default no-arg constructor
	 */
	public Order() {
		super();
		orderItems = new HashMap<String, OrderItem>();
		orderPrice = new BigDecimal(0);
		orderDate = LocalDate.now();
	}	

	/**
	 * @param orderId
	 */
	public Order(String orderId) {
		this();
		this.orderId = orderId;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the orderDate
	 */
	public LocalDate getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the orderPrice
	 */
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}

	/**
	 * @param orderPrice the orderPrice to set
	 */
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}

	/**
	 * @return the orderItems
	 */
	public Map<String, OrderItem> getOrderItems() {
		return orderItems;
	}

	/**
	 * @param orderItems the orderItems to set
	 */
	public void setOrderItems(Map<String, OrderItem> orderItems) {
		this.orderItems = orderItems;
	}	
		
	/**
	 * @param item -- order item to add to map of order items
	 */
	public void addOrderItem(OrderItem item) {
        String productId = item.getProduct().getProductId();

        if (orderItems.containsKey(productId)) {
            OrderItem existingOrderItem = orderItems.get(productId);
            existingOrderItem.setQuantity(existingOrderItem.getQuantity()
                    + item.getQuantity());
        }else{
            orderItems.put(productId, item);
        }
        updateOrderPrice();
    }
    
    /**
     * @param item order item to remove from the order items map
     */
    public void removeOrderItem(OrderItem item){
        String productId = item.getProduct().getProductId();
        orderItems.remove(productId);
        updateOrderPrice();
    }
    
    /**
     * Update the order price. Called after changes have been made to the order
     */
    public void updateOrderPrice(){
        orderPrice = new BigDecimal(0);
        
        for(OrderItem item: orderItems.values()){
        	orderPrice = orderPrice.add(item.getTotalPrice());
        }
    }


	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((orderId == null) ? 0 : orderId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId == null) {
			if (other.orderId != null)
				return false;
		} else if (!orderId.equals(other.orderId))
			return false;
		return true;
	}	
	

}
