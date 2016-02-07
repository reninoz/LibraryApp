package com.mylib.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "PERSON_BOOK")
public class PersonBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "PERSON_ID")
	@NotNull
	private Long personId;

	@NotNull
	@Column(name = "BOOK_ID")
	private Long bookId;

	@NotNull
	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "DUE_DATE")
	private Date dueDate;

	@Column(name = "RETURN_DATE")
	private Date returnDate;

	public PersonBook() {
		super();
	}

	public PersonBook(long personId, long bookId, Date startDate, Date dueDate,
			Date returnDate) {
		super();
		this.personId = personId;
		this.bookId = bookId;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
	}

	public Long getId() {
		return id;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getBookId() {
		return bookId;
	}

	public void setBookId(Long bookId) {
		this.bookId = bookId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (bookId ^ (bookId >>> 32));
		result = prime * result + ((dueDate == null) ? 0 : dueDate.hashCode());
		result = prime * result + (int) (personId ^ (personId >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonBook other = (PersonBook) obj;
		if (bookId != other.bookId)
			return false;
		if (dueDate == null) {
			if (other.dueDate != null)
				return false;
		} else if (!dueDate.equals(other.dueDate))
			return false;
		if (personId != other.personId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PersonBook [id=" + id + ", personId=" + personId + ", bookId="
				+ bookId + ", startDate=" + startDate + ", dueDate=" + dueDate
				+ ", returnDate=" + returnDate + "]";
	}

}
