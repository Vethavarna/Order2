package com.sts.rest.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Orders {
	@Id
private int orderId;
private String orderDate;
private int orderQuantity;
public int getOrderId() {
	return orderId;
}
public void setOrderId(int orderId) {
	this.orderId = orderId;
}
public String getOrderDate() {
	return orderDate;
}
public void setOrderDate(String orderDate) {
	this.orderDate = orderDate;
}
public int getOrderQuantity() {
	return orderQuantity;
}
public void setOrderQuantity(int orderQuantity) {
	this.orderQuantity = orderQuantity;
}
public Orders(int orderId, String orderDate, int orderQuantity) {
	super();
	this.orderId = orderId;
	this.orderDate = orderDate;
	this.orderQuantity = orderQuantity;
}
public Orders() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Orders [orderId=" + orderId + ", orderDate=" + orderDate + ", orderQuantity=" + orderQuantity + "]";
}


}
