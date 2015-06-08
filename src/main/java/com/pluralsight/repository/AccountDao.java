package com.pluralsight.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.pluralsight.bookmarks.Account;

@Repository("accountDao")
public interface AccountDao extends JpaRepository<Account,Long>{

	Optional<Account> findByUserName(String userName);
	
}
