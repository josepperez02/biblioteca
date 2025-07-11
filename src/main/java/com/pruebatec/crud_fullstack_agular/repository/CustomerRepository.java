package com.pruebatec.crud_fullstack_agular.repository;

import com.pruebatec.crud_fullstack_agular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
