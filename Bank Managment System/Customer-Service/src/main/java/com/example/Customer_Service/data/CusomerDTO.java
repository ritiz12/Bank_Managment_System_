package com.example.Customer_Service.data;

import java.util.List;

public class CusomerDTO {
    private Long id;
    private String name;
    private String email;
    private List<AccountDTO> accounts;
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
    public List<AccountDTO> getAccounts() {
        return accounts;
    }
    public void setAccounts(final List<AccountDTO> accounts) {
        this.accounts = accounts;
    }
}
