package ua.lviv.myproject.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "phone_number")
	private int phoneNumber;

	@ManyToMany
	@JoinTable(name = "reviews", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	List<User> users = new ArrayList<>();

	@ManyToMany
	@JoinTable(name = "ordering", joinColumns = @JoinColumn(name = "client_id"), inverseJoinColumns = @JoinColumn(name = "user_id"))
	List<User> users1 = new ArrayList<>();

	public Client() {

	}

	public Client(String firstName, String lastName, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<User> getUsers1() {
		return users1;
	}

	public void setUsers1(List<User> users1) {
		this.users1 = users1;
	}

	@Override
	public String toString() {
		return "Client [firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber
				+ ", getId()=" + getId() + "]";
	}

}
