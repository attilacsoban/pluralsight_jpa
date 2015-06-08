package com.pluralsight.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pluralsight.bookmarks.Bookmark;

@Repository("bookmarkDao")
public interface BookmarkDao extends JpaRepository<Bookmark, Long> {

	Collection<Bookmark> findByAccountUserName(String userName);
	
}
