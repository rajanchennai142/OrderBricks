package com.brickorder.rest.controller;

import com.brickorder.rest.model.Orders;
import com.brickorder.rest.dao.OrderDAO;
import com.brickorder.rest.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {
    @Autowired
    private OrderDAO orderDao;

    @GetMapping(path="/", produces = "application/json")
    public Orders getOrders()
    {
        return orderDao.getOrders();
    }

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addOrder(
            @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
            @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
            @RequestBody Order order)
    {
        //Generate resource id
        Integer id = orderDao.getOrders().getOrderList().size() + 1;
        order.setOrderReference(id.toString());

        //add resource
        orderDao.addOrder(order);

        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(order.getOrderReference())
                .toUri();

        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
