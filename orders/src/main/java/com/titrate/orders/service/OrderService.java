package com.titrate.orders.service;

import com.titrate.orders.model.Orders;

import java.util.ArrayList;

public interface OrderService {
    ArrayList<Orders> findAll();

    Orders findOrdersById(long id);

    Orders findOrdersByName(String name);

    void delete(long id);

    Orders save(Orders order);

    Orders update(Orders order, long id);
}
