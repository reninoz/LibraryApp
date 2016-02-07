package com.mylib.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mylib.model.PersonBook;

@Repository("PersonBookDao")
public class PersonBookDaoImpl implements PersonBookDao {

	@PersistenceContext
	private EntityManager em;
	
	public List<PersonBook> findAllPersonBooksByPerson(Long personId) {
		TypedQuery<PersonBook> query = em.createQuery(
	     		"select pb from PersonBook pb where pb.personId = :personId", PersonBook.class);
		query.setParameter("personId", personId);
		return query.getResultList();
	}

	public List<PersonBook> findAllPersonBooks() {
		TypedQuery<PersonBook> query = em.createQuery(
	     		"select pb from PersonBook pb", PersonBook.class);
		return query.getResultList();
	}

	public PersonBook findPersonBookById(Long id) {
		// TODO Auto-generated method stub
		return em.find(PersonBook.class, id);
	}

}
