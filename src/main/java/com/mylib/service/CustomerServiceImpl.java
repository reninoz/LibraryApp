package com.mylib.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mylib.dao.BookDao;
import com.mylib.dao.PersonBookDao;
import com.mylib.dao.PersonDao;
import com.mylib.dto.PersonBorrowingDTO;
import com.mylib.model.Book;
import com.mylib.model.Person;
import com.mylib.model.PersonBook;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private BookDao bookDao;
	
	@Autowired
	private PersonBookDao personBookDao;

	public List<Book> findAllBooks() {
		return bookDao.findAllBooks();
	}

	public List<PersonBorrowingDTO> findAllBooksBorrowedByPerson(Long personId) {
		return bookDao.findAllBooksBorrowedByPerson(personId);
	}

	public List<Person> findAllPersons() {
		return personDao.findAllPersons();
//		return createPersons();
	}

	public Person findPersonById(long id) {
		return personDao.findById(id);
	}
	
	private List<Person> createPersons() {
		List<Person> persons = new ArrayList<Person>();
		
		for (int i=0; i<10; i++) {
			int anyNum = new Random().nextInt(1000);
			String firstName = "firstName"+ anyNum;
			String lastName = "lastName" + anyNum;
			String phone =  new Random().nextInt(90000000)+10000000 + "";
			String email = String.format("%s.%%s@abc.com", firstName, lastName);
			Person person = new Person(firstName, lastName, phone, email);
			persons.add(person);
		}

		return persons;
	}

	public void addPerson(Person person) {
		personDao.savePerson(person);
		
	}

	public List<PersonBook> findAllPersonBooksByPerson(Long personId) {
		return personBookDao.findAllPersonBooksByPerson(personId);
	}

	public List<PersonBook> findAllPersonBooks() {
		return personBookDao.findAllPersonBooks();
	}

	public PersonBook findPersonBookById(Long id) {
		// TODO Auto-generated method stub
		return personBookDao.findPersonBookById(id);
	}

}
