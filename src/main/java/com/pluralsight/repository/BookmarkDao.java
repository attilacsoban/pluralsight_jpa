package com.pluralsight.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.pluralsight.bookmarks.Bookmark;

@Repository("bookmarkDao")
public interface BookmarkDao extends JpaRepository<Bookmark, Long> {

	//@Query(value = "select b form Bookmark b where b.account.username = :userName")
	Collection<Bookmark> findByAccountUserName(/*@Param("userName")*/ String userName);
	
}
