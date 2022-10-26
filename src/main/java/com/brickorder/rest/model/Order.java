package com.brickorder.rest.model;

import java.util.Date;

public class Order {

    private String orderReference;
    private int noOfBrickes;
    private Date despatchedDate;
    private String status;

    public Order() {

    }

    @Override
    public String toString() {
        return "Order{" +
                "orderReference='" + orderReference + '\'' +
                ", noOfBrickes=" + noOfBrickes +
                ", despatchedDate=" + despatchedDate +
                ", status='" + status + '\'' +
                '}';
    }

    public Date getDespatchedDate() {
        return despatchedDate;
    }

    public void setDespatchedDate(Date despatchedDate) {
        this.despatchedDate = despatchedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Order(String orderReference, int noOfBrickes, Date despatchedDate, String status) {
        super();
        this.orderReference = orderReference;
        this.noOfBrickes = noOfBrickes;
        this.despatchedDate = despatchedDate;
        this.status = status;
    }


    public String getOrderReference() {
        return orderReference;
    }

    public void setOrderReference(String orderReference) {
        this.orderReference = orderReference;
    }

    public int getNoOfBrickes() {
        return noOfBrickes;
    }

    public void setNoOfBrickes(int noOfBrickes) {
        this.noOfBrickes = noOfBrickes;
    }
}
