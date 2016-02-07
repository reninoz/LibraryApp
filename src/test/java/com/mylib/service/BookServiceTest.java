package com.mylib.service;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.mylib.model.Book;


public class BookServiceTest extends BaseTest {
	
	@Autowired
	BookService bookService;
	
	@Test
	public void findBookById() {
		Book book = bookService.findBookById(100l);
		assertThat("the service returned a null ", book,
				is(notNullValue()));
	}

}
