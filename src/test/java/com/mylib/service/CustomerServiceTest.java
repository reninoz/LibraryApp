package com.mylib.service;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mylib.dto.PersonBorrowingDTO;
import com.mylib.model.Book;
import com.mylib.model.Person;
import com.mylib.model.PersonBook;

public class CustomerServiceTest extends BaseTest {
	@Autowired
	private CustomerService customerService;

	@Test
	public void readAllPersons() {
		List<Person> persons = customerService.findAllPersons();
		assertThat("the service returned a null list", persons,
				is(notNullValue()));
		assertThat("the service didn't return any persons", persons.size(),
				is(greaterThan(0)));
	}

	@Test
	public void readAllBooks() {
		List<Book> books = customerService.findAllBooks();
		assertThat("the service returned a null list", books,
				is(notNullValue()));
		assertThat("the service didn't return any persons", books.size(),
				is(greaterThan(0)));
	}
	
	@Test
	public void findAllPersonBooksByPerson() {
		List<PersonBook> books = customerService.findAllPersonBooksByPerson(1L);
		System.out.println("books size..................." + books.size());
		assertThat("the service returned a null list", books,
				is(notNullValue()));
		assertThat("the service didn't return any books borrowed", books.size(),
				is(greaterThan(0)));
	}
	
	@Test
	public void findAllPersonBooks() {
		List<PersonBook> books = customerService.findAllPersonBooks();
		System.out.println("books size..................." + books.size());
		assertThat("the service returned a null list", books,
				is(notNullValue()));
		assertThat("the service didn't return any books borrowed", books.size(),
				is(greaterThan(0)));
	}
	
	@Test
	public void readAllBooksBorrowedByPerson() {
		List<PersonBorrowingDTO> books = customerService.findAllBooksBorrowedByPerson(1L);
		System.out.println("books size..................." + books.size());
		assertThat("the service returned a null list", books,
				is(notNullValue()));
		assertThat("the service didn't return any books borrowed", books.size(),
				is(greaterThan(0)));
	}

	@Test
	public void readPerson() {
		assertThat("couldn't read person ", customerService.findPersonById(1),
				is(notNullValue()));
	}
	
	@Test
	public void findPersonBookById() {
		PersonBook personBook = customerService.findPersonBookById(201l);
		System.out.println(personBook);
		assertThat("couldn't read person_book ", personBook,
				is(notNullValue()));
	}
}
