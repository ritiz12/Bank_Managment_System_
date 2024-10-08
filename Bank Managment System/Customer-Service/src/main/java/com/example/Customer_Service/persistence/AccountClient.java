package com.example.Customer_Service.persistence;

import com.example.Customer_Service.data.AccountDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient("account-service")
public interface AccountClient {
    @GetMapping("/accounts/{customerId}")
    List<AccountDTO> getAccountByCustomerId(@PathVariable("customerId") String customerId);
}
