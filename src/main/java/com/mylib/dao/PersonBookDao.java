package com.mylib.dao;

import java.util.List;

import com.mylib.model.PersonBook;

public interface PersonBookDao {
	
	List<PersonBook> findAllPersonBooksByPerson(Long personId);
	
	List<PersonBook> findAllPersonBooks();
	
	PersonBook findPersonBookById(Long id);

}
