package com.mylib.dto;

import java.io.Serializable;
import java.util.Date;

import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.mylib.util.JsonDateSerializer;

public class PersonBorrowingDTO implements Serializable{
	

	private String title;
	
	private String author;
	
	private String isbn;
	
	private Date startDate;

	private Date dueDate;

	private Date returnDate;
	
	

	public PersonBorrowingDTO() {
		super();
	}


	public PersonBorrowingDTO(String title, String author, String isbn,
			Date startDate, Date dueDate, Date returnDate) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.startDate = startDate;
		this.dueDate = dueDate;
		this.returnDate = returnDate;
	}




	public String getTitle() {
		return title;
	}

	
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getDueDate() {
		return dueDate;
	}


	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getReturnDate() {
		return returnDate;
	}


	public String getAuthor() {
		return author;
	}


	public String getIsbn() {
		return isbn;
	}

	
}
