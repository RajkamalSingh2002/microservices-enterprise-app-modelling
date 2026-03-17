package com.rajkamalsingh.accounttransactionsservice.repository;

import com.rajkamalsingh.accounttransactionsservice.model.AccountTransaction;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountTransactionRepository extends MongoRepository<AccountTransaction, String> {

    // Find all transactions for a given account
    List<AccountTransaction> findByAccountId(String accountId);
}
