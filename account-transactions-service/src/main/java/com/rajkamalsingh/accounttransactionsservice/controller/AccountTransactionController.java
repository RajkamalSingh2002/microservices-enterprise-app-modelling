package com.rajkamalsingh.accounttransactionsservice.controller;

import com.rajkamalsingh.accounttransactionsservice.model.AccountTransaction;
import com.rajkamalsingh.accounttransactionsservice.service.AccountTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transactions")
public class AccountTransactionController {

    @Autowired
    private AccountTransactionService accountTransactionService;

    @PostMapping("/reserve")
    public AccountTransaction reserveStock(@RequestBody AccountTransaction transaction) {
        return accountTransactionService.reserveStock(transaction);
    }

    @GetMapping("/{accountId}")
    public List<AccountTransaction> getTransactionsByAccount(@PathVariable String accountId) {
        return accountTransactionService.getTransactionsByAccount(accountId);
    }

    @GetMapping("/all")
    public List<AccountTransaction> getAllTransactions() {
        return accountTransactionService.getAllTransactions();
    }
}
