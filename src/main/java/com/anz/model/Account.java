package com.anz.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Account {
	@Id
	@GeneratedValue
	private Integer accountNumber;
	private String accountName;
	private String accountType;
	private Date balanceDate;
	private String currency;
	
	private double availableBalance;
	
	@OneToMany(mappedBy="account")
	@JsonIgnore
	private List<AccountTransactions> accountTransactions;
	
	
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Date getBalanceDate() {
		return balanceDate;
	}
	public void setBalanceDate(Date balanceDate) {
		this.balanceDate = balanceDate;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public double getAvailableBalance() {
		return availableBalance;
	}
	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}
	public List<AccountTransactions> getAccountTransactions() {
		return accountTransactions;
	}
	public void setAccountTransactions(List<AccountTransactions> accountTransactions) {
		this.accountTransactions = accountTransactions;
	}
	
	
	public Account() { }
	public Account(Integer accountNumber, String accountName, String accountType,
			Date balanceDate, String currency,
			double availableBalance,List<AccountTransactions> accountTransactions) {
		super();
		this.accountNumber = accountNumber;
		this.accountName = accountName;
		this.accountType = accountType;
		this.balanceDate = balanceDate;
		this.currency = currency;
		this.availableBalance = availableBalance;
		this.accountTransactions = accountTransactions;
	}
	
}
