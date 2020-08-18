package com.anz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anz.model.Account;
import com.anz.model.AccountTransactions;
import com.anz.repository.AccountRepository;
import com.anz.repository.AccountTransactionRepository;
import com.anz.service.AccountService;

@RestController
public class AccountController {
	
	 @Autowired 
	private AccountService accountService;
	
	@RequestMapping("/accounts")
	public List<Account> listAllAccounts(){
		return accountService.listAllAccounts();
	}
	
	
	@RequestMapping("/transactions/{accountNo}")
	public List<AccountTransactions> listAccountTransaction(@PathVariable Integer accountNo){
		return accountService.listAccountTransactions(accountNo);
	}
	
	
}
