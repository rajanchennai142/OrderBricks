package com.brickorder.rest;

import com.brickorder.rest.controller.OrderController;
import com.brickorder.rest.dao.OrderDAO;
import com.brickorder.rest.model.Order;
import com.brickorder.rest.model.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootBrickOrderTests {

	@Test
	public void orderControllerTest() {
		OrderController orderController = new OrderController();
		OrderDAO orderDAO = new OrderDAO();
		System.out.println("o "+ orderDAO.getOrders().getOrderList());
		//Orders orders =  orderController.getOrders();
		assertTrue ("false", !orderDAO.getOrders().getOrderList().isEmpty());

	}

}
