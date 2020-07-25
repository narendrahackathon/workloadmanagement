package com.wawa.hcl.workloadmanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderRequest implements Serializable {
    private static final long serialVersionUID = 1L;
    private String orderNumber;
    private  String orderDescription;
    private int quantity;
    private  String productCode;
    private String productDescription;
    private String toppings1;
    private String toppings2;
    private String toppings3;
    private double price;
    private String orderStatus;

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public void setOrderDescription(String orderDescription) {
        this.orderDescription = orderDescription;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setToppings1(String toppings1) {
        this.toppings1 = toppings1;
    }

    public void setToppings2(String toppings2) {
        this.toppings2 = toppings2;
    }

    public void setToppings3(String toppings3) {
        this.toppings3 = toppings3;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getOrderDescription() {
        return orderDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductCode() {
        return productCode;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getToppings1() {
        return toppings1;
    }

    public String getToppings2() {
        return toppings2;
    }

    public String getToppings3() {
        return toppings3;
    }

    public double getPrice() {
        return price;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    @Override
    public String toString() {
        return "OrderRequest{" +
                "orderNumber='" + orderNumber + '\'' +
                ", orderDescription='" + orderDescription + '\'' +
                ", quantity=" + quantity +
                ", productCode='" + productCode + '\'' +
                ", productDescription='" + productDescription + '\'' +
                ", toppings1='" + toppings1 + '\'' +
                ", toppings2='" + toppings2 + '\'' +
                ", toppings3='" + toppings3 + '\'' +
                ", price=" + price +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
