package com.example.Customer_Service.domain;
import com.example.Customer_Service.data.AccountDTO;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;


    public Customer()
    {

    }
    public Customer(final Long id, final String name, final String email) {
        this.id = id;
        this.name = name;
        this.email = email;

    }
    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(final String email) {
        this.email = email;
    }
  /*  public List<AccountDTO> getAccounts() {
        return accounts;
    }
    public void setAccounts(final List<AccountDTO> accounts) {
        this.accounts = accounts;
    }

   */
}
