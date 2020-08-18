package com.anz.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.anz.model.Account;
import com.anz.model.AccountTransactions;
import com.anz.repository.AccountRepository;
import com.anz.repository.AccountTransactionRepository;
@Service
public class AccountService {
	@Autowired
	AccountRepository accountRepository ;
	@Autowired
	AccountTransactionRepository accountTransactionRepository;
	
	public List<Account> listAllAccounts(){
		return accountRepository.findAll();
		
	}
	@ExceptionHandler(RuntimeException.class)
	public List<AccountTransactions> listAccountTransactions(Integer accountNo){
		Optional<Account> accountOptional = accountRepository.findById(accountNo);
		if (!accountOptional.isPresent()) {
			throw new RuntimeException("No Account Found with this Id");
		}
		return accountOptional.get().getAccountTransactions();
		
	}
	
}
