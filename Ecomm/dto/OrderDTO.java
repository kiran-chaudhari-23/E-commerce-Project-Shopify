package com.ecom.Ecomm.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {

    private Long id;

    private double totalAmount;

    private String status;

    private Date orderDate;

    private String userName;

    private String email;

    protected List<OrderItemDTO> orderItem;

    public OrderDTO(Long id, double totalAmount, String status, Date orderDate, String userName, String email, List<OrderItemDTO> orderItem) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
        this.userName = userName;
        this.email = email;
        this.orderItem = orderItem;
    }


    public OrderDTO(Long id, double totalAmount, String status, Date orderDate,List<OrderItemDTO> orderItem) {
        this.id = id;
        this.totalAmount = totalAmount;
        this.status = status;
        this.orderDate = orderDate;
        this.orderItem = orderItem;
    }






    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<OrderItemDTO> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItemDTO> orderItem) {
        this.orderItem = orderItem;
    }
}
