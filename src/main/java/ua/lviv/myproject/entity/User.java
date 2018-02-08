package ua.lviv.myproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity{
	@Column(name = "login")
	private String login;
	
	@Column(name = "password")
	private String password;

	public User() {
		
	}
	
	public User(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", getId()=" + getId() + "]";
	}
	
	
	
	
	
	

}
