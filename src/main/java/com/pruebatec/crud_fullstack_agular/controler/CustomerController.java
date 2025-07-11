package com.pruebatec.crud_fullstack_agular.controler;

import com.pruebatec.crud_fullstack_agular.entity.Customer;
import com.pruebatec.crud_fullstack_agular.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //localhost:8080/api/customers/create
    @PostMapping("/create")
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    //localhost:8080api/customers
    @GetMapping
    public List<Customer> findAll(){
        return customerService.findAll();
    }

    //localhost:8080/api/customers/1
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.finByID(id);
    }

    //localhost:8080/api/customers/1
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    //localhost:8080/api/customers
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.finByID(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());
        return customerService.update(customerDb);
    }
}
