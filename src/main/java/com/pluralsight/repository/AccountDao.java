package com.pluralsight.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.bookmarks.Account;

@Repository("accountDao")
public interface AccountDao extends JpaRepository<Account,Long>{

	Collection<Account> findByUserName(String userName);
	
}
