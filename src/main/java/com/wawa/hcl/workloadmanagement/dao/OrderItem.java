package com.wawa.hcl.workloadmanagement.dao;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "OrderItem")
public class OrderItem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int order_id;
    private String user_id;
    private int quantity;
    private double total_price;
    private String order_desc;
    private Date createdAt;
    private List<Item> items_list;

    public OrderItem(int order_id, String user_id, int quantity, double total_price, String order_desc, Date createdAt) {
        super();
        this.order_id = order_id;
        this.user_id = user_id;
        this.quantity = quantity;
        this.total_price = total_price;
        this.order_desc = order_desc;
        this.createdAt = createdAt;
        //this.item = item;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    public String getOrder_desc() {
        return order_desc;
    }

    public void setOrder_desc(String order_desc) {
        this.order_desc = order_desc;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Item getItem() {
        return item;
    }

    //public void setItem(com.wawa.hcl.workloadmanagement.entity.Item item) {
     //   this.item = item;
   // }

}
