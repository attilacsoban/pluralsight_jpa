package com.pluralsight.bookmarks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = Bookmark.TABLE_NAME)
public class Bookmark {

	public final static String TABLE_NAME = "bookmark";
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String uri;
	
	private String description;
	
	
	
	public Bookmark(Account account, String uri, String desc) {
		this.uri = uri;
		this.description = desc;
		this.account = account;
	}

	public Bookmark() {
	}
	
	@ManyToOne
	private Account account;

	public Long getId() {
		return id;
	}

	public String getUri() {
		return uri;
	}

	

	public String getDescription() {
		return description;
	}

	public Account getAccount() {
		return account;
	}
	
	
	
}
