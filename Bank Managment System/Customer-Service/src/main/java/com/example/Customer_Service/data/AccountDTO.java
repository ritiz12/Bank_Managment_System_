package com.example.Customer_Service.data;

public class AccountDTO {
    private Long id;
    private String customerId;
    private String accountNumber;
    private Double balance;
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
    public AccountDTO(final Long id, final String customerId, final String accountNumber, final Double balance) {
        this.id = id;
        this.customerId = customerId;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    @Override
    public String toString() {
        return "AccountDTO{" +
            "id=" + id +
            ", customerId='" + customerId + '\'' +
            ", accountNumber='" + accountNumber + '\'' +
            ", balance=" + balance +
            '}';
    }
}
