package com.mylib.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mylib.model.Person;

@Repository("spitterDao")
public class PersonDaoImpl implements PersonDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<Person> findAllPersons() {
		TypedQuery<Person> query = em.createQuery(
	     		"select p from Person p order by p.lastName asc", Person.class);
		return query.getResultList();
	}

	public Person findById(Long id) {
		return em.find(Person.class, id);
	}

	
	public void savePerson(Person person) {
		em.persist(person);
		
	}

/*	public void deletePersonById(long id) {
		org.hibernate.Query query = getSession().createSQLQuery("delete from Person where id = :id");
		query.setLong("id", id);
		query.executeUpdate();
		
	}*/

}
