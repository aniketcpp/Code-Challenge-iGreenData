package com.anz.engineering.main.test;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.anz.model.Account;
import com.anz.repository.AccountRepository;
import com.anz.repository.AccountTransactionRepository;
@ExtendWith(SpringExtension.class)
@DataJpaTest
public class AccountRepositoryTest {

	@Autowired
	private AccountRepository accountRepository;

	@Autowired
	private AccountTransactionRepository accountTransactionRepository;
	@Test
	public void testSearchOneAccountWithId() {
		// Id 1000002 
		Optional<Account> account = accountRepository.findById(1000002);
		assertThat(account.get().getAccountName() == "ANZ0002");
	}
	@Test
	public void testSearchAllAccountCount() {
		List<Account> listofAccounts = accountRepository.findAll();
		assertThat(listofAccounts.size() == 6);
	}
	@Test
	public void testSearchAllTransaction() {
		List<Account> listofAccounts = accountRepository.findAll();
		assertThat(listofAccounts.size() == 6);
	}
	
	@Test
	public void testSearchTransactionByAccountId() {
		Optional<Account> accountOptional = accountRepository.findById(1000002);
		assertThat(accountOptional.get().getAccountTransactions().size() == 2);
	}
	
	
}
