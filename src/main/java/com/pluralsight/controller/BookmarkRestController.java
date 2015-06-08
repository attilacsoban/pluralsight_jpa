package com.pluralsight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	
	
}
