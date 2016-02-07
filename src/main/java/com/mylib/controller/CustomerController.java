package com.mylib.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.mylib.dto.PersonBorrowingDTO;
import com.mylib.model.Book;
import com.mylib.model.Person;
import com.mylib.service.CustomerService;

@Controller
public class CustomerController {

	private static Logger logger = Logger.getLogger(CustomerController.class);
	
	@Autowired
	CustomerService customerService;

	@Autowired
	MessageSource messageSource;

	@RequestMapping(value = { "/", "index" })
	public String index() {
		return "index";
	}

	/*
	 * This method will list all existing persons.
	 */
	@RequestMapping(value = { "/viewPesonList" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model) {

		List<Person> persons = customerService.findAllPersons();
		model.addAttribute("persons", persons);
		return "personList";
	}

	/*
	 * This method will list all existing books.
	 */
	@RequestMapping(value = { "/viewBookList" }, method = RequestMethod.GET)
	public String listBooks(ModelMap model) {

		List<Book> books = customerService.findAllBooks();
		model.addAttribute("books", books);
		return "bookList";
	}

	/*
	 * This method will list all books borrowed by a person.
	 */
	@RequestMapping(value = { "/booksborrowed" }, method = RequestMethod.GET)
	public String listEmployees(ModelMap model, Long persionId) {

		List<PersonBorrowingDTO> bookings = customerService
				.findAllBooksBorrowedByPerson(persionId);
		model.addAttribute("booksBorrowed", bookings);
		return "booksBorrowed";
	}


	/*
	 * This method will list all books borrowed by a person.
	 */
	@RequestMapping(value = "/findBooksBorrowed/{personId}", produces = "application/json")
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody 
	public List<PersonBorrowingDTO> getBooksBorrowed(@PathVariable Long personId) {
		logger.debug("person id is passed as........... : " + personId);
		List<PersonBorrowingDTO> booksBorrowed = customerService.findAllBooksBorrowedByPerson(personId);
		return booksBorrowed;
	}

}
