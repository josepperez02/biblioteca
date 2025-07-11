package com.pruebatec.crud_fullstack_agular.service;

import com.pruebatec.crud_fullstack_agular.entity.Customer;

import java.util.List;

public interface CustomerService {
    Customer save(Customer customer);
    List<Customer>findAll();
    Customer finByID(Integer id);
    void deleteById(Integer id);
    Customer update(Customer customer);
}
