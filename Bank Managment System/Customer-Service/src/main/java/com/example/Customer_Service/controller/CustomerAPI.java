package com.example.Customer_Service.controller;

import com.example.Customer_Service.data.AccountDTO;
import com.example.Customer_Service.domain.Customer;
import com.example.Customer_Service.persistence.AccountClient;
import com.example.Customer_Service.persistence.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerAPI {
    @Autowired
    private AccountClient accountClient;

    @Autowired
    private CustomerRepository customerRepository;
    @GetMapping("/{customerId}")
  public String getCustomerDetails(@PathVariable Long customerId ){
        Customer customer = customerRepository.findById(customerId).orElseThrow(()->new RuntimeException("Customer not found"));

        List<AccountDTO> accounts = accountClient.getAccountByCustomerId(customerId.toString());
        return "Customer: " + customer.getName() + ", Accounts: " + accounts.toString();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerRepository.save(customer);
    }
}
