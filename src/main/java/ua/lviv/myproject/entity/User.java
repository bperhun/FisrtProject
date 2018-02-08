package ua.lviv.myproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User extends BaseEntity {
	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinColumn(name = "user_details_id")
	UserDetails userDetails;

	@ManyToMany
	@JoinTable(name = "reviews", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "client_id"))
	List<Client> clients = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "ordering", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "client_id"))
	List<Client> clients1 = new ArrayList<>();

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

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Client> getClients1() {
		return clients1;
	}

	public void setClients1(List<Client> clients1) {
		this.clients1 = clients1;
	}

	@Override
	public String toString() {
		return "User [login=" + login + ", password=" + password + ", getId()=" + getId() + "]";
	}

}
