package com.mylib.dao;

import java.util.List;

import com.mylib.model.Person;

public interface PersonDao {
	
	List<Person> findAllPersons();
	
	Person findById(Long id);
	
	void savePerson(Person person);
	
//	void deletePersonById(long id);
	

}
