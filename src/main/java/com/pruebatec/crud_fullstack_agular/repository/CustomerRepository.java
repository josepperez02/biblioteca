package com.pruebatec.crud_fullstack_agular.repository;

import com.pruebatec.crud_fullstack_agular.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
