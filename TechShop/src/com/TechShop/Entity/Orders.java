package com.TechShop.Entity;

import java.util.Date;
import java.util.List;

public class Orders {
	
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomers(Customers customer) {
		this.customer = customer;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	private int orderID;
    private Customers customer; // Composition
    private Date orderDate;
    private double totalAmount;
	
    public Orders(int orderID, Customers customer, Date orderDate, double totalAmount) {
		super();
		this.orderID = orderID;
		this.customer = customer;
		this.orderDate = orderDate;
		this.totalAmount = totalAmount;
	}
    
    public double calculateTotalAmount(List<OrderDetails> orderDetails) {
        totalAmount = 0;
        for (OrderDetails detail : orderDetails) {
            totalAmount += detail.calculateSubtotal();
        }
        return totalAmount;
    }

    public void getOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: " + totalAmount);
    }

    public void updateOrderStatus(String status) {
        System.out.println("Order Status Updated to: " + status);
    }

    public void cancelOrder() {
        System.out.println("Order " + orderID + " has been canceled.");
    }
    
    @Override
	public String toString() {
		return "Order [orderID=" + orderID + ", customer=" + customer + ", orderDate=" + orderDate + ", totalAmount="
				+ totalAmount + "]";
	}   
    
}