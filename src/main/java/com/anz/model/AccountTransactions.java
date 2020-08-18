package com.anz.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "accountTransactions")
public class AccountTransactions {
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	private Account account;

	private Date valueDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Account getAccountDetail() {
		return account;
	}
	public void setAccountDetail(Account account) {
		this.account = account;
	}
	public Date getValueDate() {
		return valueDate;
	}
	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}
	public double getDebitAmount() {
		return debitAmount;
	}
	public void setDebitAmount(double debitAmount) {
		this.debitAmount = debitAmount;
	}
	public double getCreditAmount() {
		return creditAmount;
	}
	public void setCreditAmount(double creditAmount) {
		this.creditAmount = creditAmount;
	}
	public String getDebitCredit() {
		return debitCredit;
	}
	public void setDebitCredit(String debitCredit) {
		this.debitCredit = debitCredit;
	}
	public String getTransactionNarrative() {
		return transactionNarrative;
	}
	public void setTransactionNarrative(String transactionNarrative) {
		this.transactionNarrative = transactionNarrative;
	}
	private double debitAmount;
	private double creditAmount;
	private String debitCredit;
	private String transactionNarrative;
}
