package com.mylib.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mylib.dao.BookDao;
import com.mylib.model.Book;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {

	@Autowired
	private BookDao bookDao;
	
	public Book findBookById(Long id) {
		return bookDao.findBookById(id);
	}

}
