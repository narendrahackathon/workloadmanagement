package com.wawa.hcl.workloadmanagement.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item {

	public Item() {
	}

	@Id
	private int item_id;
	private String item_desc;
	private int quantity;
	private double total_price;
	private boolean topping_1;
	private boolean topping_2;
	private boolean topping_3;
	private String item_status;
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private OrderItem oi;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_desc() {
		return item_desc;
	}

	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public boolean isTopping_1() {
		return topping_1;
	}

	public void setTopping_1(boolean topping_1) {
		this.topping_1 = topping_1;
	}

	public boolean isTopping_2() {
		return topping_2;
	}

	public void setTopping_2(boolean topping_2) {
		this.topping_2 = topping_2;
	}

	public boolean isTopping_3() {
		return topping_3;
	}

	public void setTopping_3(boolean topping_3) {
		this.topping_3 = topping_3;
	}

	public String getItem_status() {
		return item_status;
	}

	public void setItem_status(String item_status) {
		this.item_status = item_status;
	}

}
