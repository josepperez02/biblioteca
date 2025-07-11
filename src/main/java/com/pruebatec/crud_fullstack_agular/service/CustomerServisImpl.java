package com.pruebatec.crud_fullstack_agular.service;

import com.pruebatec.crud_fullstack_agular.entity.Customer;
import com.pruebatec.crud_fullstack_agular.exception.ResourceNotFoundException;
import com.pruebatec.crud_fullstack_agular.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServisImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServisImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer finByID(Integer id) {
        Customer customer = customerRepository.findById(id).orElseThrow(
                ()->{
                    throw new ResourceNotFoundException("Customer con id "+id+ " no se encuentra");
                }
        );
//        return customerRepository.findById(id).get();
        return customer;
    }

    @Override
    public void deleteById(Integer id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Customer update(Customer customer) {
        return customerRepository.save(customer);
    }
}
