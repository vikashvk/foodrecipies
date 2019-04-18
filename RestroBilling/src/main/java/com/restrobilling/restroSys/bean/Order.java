package com.restrobilling.restroSys.bean;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {

	@Id
	private int orderId;
	private String custName;
	private String orderStatus = "pending";
	private ArrayList<FoodQtyPair> orderList = new ArrayList<FoodQtyPair>();
	
	public ArrayList<FoodQtyPair> getOrderList() {
		return orderList;
	}
	public void setOrderList(ArrayList<FoodQtyPair> orderList) {
		this.orderList = orderList;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", custName=" + custName + ", orderStatus=" + orderStatus + "]";
	}

	
}
