package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class Order {


    public String delivery_add;
    private  long orderId;
    private Date orderDate;

    private Vendor vendor;
    private Customer customer;
    private double totalAmount;
    private List<OrderMenuItem> menuItems;


    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public List<OrderMenuItem> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public String getDelivery_add() {
        return delivery_add;
    }

    public void setDelivery_add(String delivery_add) {
        this.delivery_add = delivery_add;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}

