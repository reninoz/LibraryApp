package com.mylib.dao;

import java.util.List;

import com.mylib.dto.PersonBorrowingDTO;
import com.mylib.model.Book;

public interface BookDao {
	
	Book findBookById(Long id);
	
	List<Book> findAllBooks();
	
	List<PersonBorrowingDTO> findAllBooksBorrowedByPerson(Long personId);

}
