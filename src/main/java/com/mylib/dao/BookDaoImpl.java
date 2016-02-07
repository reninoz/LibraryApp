package com.mylib.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.mylib.dto.PersonBorrowingDTO;
import com.mylib.model.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	
	@PersistenceContext
	private EntityManager em; 

	public List<Book> findAllBooks() {
		TypedQuery<Book> query = em.createQuery(
	     		"select b from Book b order by b.title asc", Book.class);
	     return query.getResultList();
	}

	public List<PersonBorrowingDTO> findAllBooksBorrowedByPerson(Long personId) {
		String queryStr = "select new com.mylib.dto.PersonBorrowingDTO("
				+ "b.title, b.author, b.isbn, bp.startDate, bp.dueDate, bp.returnDate) "
				+ "from Book b, PersonBook bp where bp.personId = :personId and b.id = bp.bookId ";
		/*
		TypedQuery<Book> query = em.createQuery(
	     		"select b from Book b where b.id in (select pb.bookId from PersonBook pb where pb.personId = :personId)", Book.class);
		*/
		TypedQuery<PersonBorrowingDTO> query = em.createQuery(queryStr, PersonBorrowingDTO.class);
		query.setParameter("personId", personId);
		return query.getResultList();
	}

	public Book findBookById(Long id) {
		// TODO Auto-generated method stub
		return em.find(Book.class, id);
	}

}
