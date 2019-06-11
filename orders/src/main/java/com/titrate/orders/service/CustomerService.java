package com.titrate.orders.service;

import com.titrate.orders.model.Customers;
import com.titrate.orders.model.Customers;

import java.util.ArrayList;

public interface CustomerService {
    ArrayList<Customers> findAll();

    Customers findCustomersById(long id);

    Customers findCustomersByName(String name);

    void delete(long id);

    Customers save(Customers customer);

    Customers update(Customers customer, long id);
}
