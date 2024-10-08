package com.example.Account_Service.controller;

import com.example.Account_Service.domain.Account;
import com.example.Account_Service.persistence.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountAPI {
    @Autowired
    private AccountRepository accountRepository;

    @GetMapping("/{customerId}")
    public List<Account> getAccountsByCustomerId(@PathVariable String customerId) {
        return accountRepository.findByCustomerId(customerId);
    }

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        return accountRepository.save(account);
    }

}
