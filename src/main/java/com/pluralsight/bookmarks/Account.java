package com.pluralsight.bookmarks;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = Account.TABLE_NAME)
public class Account {

	public static final String TABLE_NAME = "account";
	
	public Account(String name, String password) {
        this.userName = name;
        this.password = password;
    }
	
	public Account() {		
	}
	
	@Id
	@GeneratedValue
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private String password;
	private String userName;

	public String getPassword() {
		return password;
	}

	public String getUserName() {
		return userName;
	}
	
	@OneToMany(mappedBy = "account")
	private List<Bookmark> bookmarks;
	
	
}
