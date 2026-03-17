package com.rajkamalsingh.accounttransactionsservice.service;

import com.rajkamalsingh.accounttransactionsservice.model.AccountTransaction;
import com.rajkamalsingh.accounttransactionsservice.repository.AccountTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountTransactionService {

    @Autowired
    private AccountTransactionRepository accountTransactionRepository;

    public AccountTransaction reserveStock(AccountTransaction transaction) {
        transaction.setStatus("RESERVED");
        return accountTransactionRepository.save(transaction);
    }

    public List<AccountTransaction> getTransactionsByAccount(String accountId) {
        return accountTransactionRepository.findByAccountId(accountId);
    }

    public List<AccountTransaction> getAllTransactions() {
        return accountTransactionRepository.findAll();
    }
}
