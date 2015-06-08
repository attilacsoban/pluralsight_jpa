package com.pluralsight.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pluralsight.bookmarks.Bookmark;
import com.pluralsight.repository.AccountDao;
import com.pluralsight.repository.BookmarkDao;

@Controller
@RequestMapping("/{userName}/bookmarks")
public class BookmarkRestController {
	
	@Autowired
	private AccountDao accountDao;
	
	@Autowired
	private BookmarkDao bookmarkDao;
	
	private void validateUser(String userName) throws Exception{
		this.accountDao.findByUserName(userName);
		if(userName == null)
			throw new Exception("no user found");
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	Collection<Bookmark> readBookmarks(@PathVariable String userName){
		try {
			this.validateUser(userName);
			return this.bookmarkDao.findByAccountUserName(userName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
