package com.brickorder.rest.dao;

import com.brickorder.rest.model.Order;
import com.brickorder.rest.model.Orders;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class OrderDAO {
    private static Orders list1 = new Orders();

    static {
        list1.getOrderList().add(new Order("1", 100, new Date(), "test"));
    }


    public Orders getOrders() {
        return list1;
    }


    public void addOrder(Order order) {
        list1.getOrderList().add(order);
    }

}

