package com.anz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.model.AccountTransactions;
@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransactions, Integer>{

}
