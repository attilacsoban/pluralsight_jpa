package com.pluralsight.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.bookmarks.Bookmark;

@Repository("bookmarkDao")
public interface BookmarkDao extends JpaRepository<Bookmark, Long> {

	//  CSA @Query(value = "select b form Bookmark b where b.account.username = :userName")   @Param("userName")
	Collection<Bookmark> findByAccountUserName(String userName);
	
}
