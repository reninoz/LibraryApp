package com.mylib.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;


@Entity
@Table(name="PERSON")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(min=1, max=50)
	@Column(name = "FIRST_NAME", nullable = false)
	private String firstName;
	
	@Size(min=1, max=50)
	@Column(name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@NotEmpty
	@Column(name = "PHONE", unique=true, nullable = false)
	private String phone;
	
	@NotEmpty
	@Column(name = "EMAIL", unique=true, nullable = false)
	private String email;
	
/*	@OneToMany(mappedBy = "person")
	private Set<Borrowing> borrowings =	new HashSet<Borrowing>();*/
	
	public Person() {
		super();
	}

	public Person(String firstName, String lastName, String phone,
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
	}

	public Long getId() {
		return id;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
/*	

	public Set<Borrowing> getBorrowings() {
		return borrowings;
	}

	public void setBorrowings(Set<Borrowing> borrowings) {
		this.borrowings = borrowings;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + firstName.hashCode() + lastName.hashCode();
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + getName() + ", phone="
				+ phone + ", email=" + email +"]";
	}
	
	
	

}
