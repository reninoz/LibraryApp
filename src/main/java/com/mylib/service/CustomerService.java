package com.mylib.service;

import java.util.List;

import com.mylib.dto.PersonBorrowingDTO;
import com.mylib.model.Book;
import com.mylib.model.Person;
import com.mylib.model.PersonBook;

public interface CustomerService {
	
	List<Book> findAllBooks();
	
	List<PersonBorrowingDTO> findAllBooksBorrowedByPerson(Long personId);
	
	List<Person> findAllPersons();
	
	Person findPersonById(long id);

	void addPerson(Person person);
	
	List<PersonBook> findAllPersonBooksByPerson(Long personId);
	
	List<PersonBook> findAllPersonBooks();
	
	PersonBook findPersonBookById(Long id);

}
