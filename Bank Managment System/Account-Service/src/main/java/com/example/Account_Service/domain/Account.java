package com.example.Account_Service.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Account {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerId;
    private String accountNumber;
    private Double balance;
    // Default constructor
    public Account() {
    }
    public Account(final Long id, final String customerId, final String accountNumber, final Double balance) {
        this.id = id;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
        this.id = id;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(final String customerId) {
        this.customerId = customerId;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(final String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public Double getBalance() {
        return balance;
    }
    public void setBalance(final Double balance) {
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "Account{" +
            "id=" + id +
            ", customerId='" + customerId + '\'' +
            ", accountNumber='" + accountNumber + '\'' +
            ", balance=" + balance +
            '}';
    }
}
