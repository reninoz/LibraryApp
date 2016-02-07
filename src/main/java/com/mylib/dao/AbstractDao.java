package com.mylib.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

public abstract class AbstractDao<PK extends Serializable, T> {
	
	private final Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")
	public AbstractDao(){
		this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
	}
	
	
	@PersistenceContext
	protected EntityManager em;


	@SuppressWarnings("unchecked")
	public T getByKey(PK key) {
		return (T) em.find(persistentClass, key);
	}

	
	@Transactional
	public void delete(long id) {
		T entity = em.getReference(persistentClass, id);
		em.remove(entity);
	}
	
	@Transactional
	public void save(T entity) {
		em.persist(entity);
	}

}
