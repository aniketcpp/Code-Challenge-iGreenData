package com.anz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anz.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{

}
