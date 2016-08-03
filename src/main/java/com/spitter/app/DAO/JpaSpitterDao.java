package com.spitter.app.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.spitter.app.entity.*;

@Repository
@Transactional
public class JpaSpitterDao implements SpitterDao {
	private static final String RECENT_SPITTLES = "SELECT s FROM Spittle s";
	private static final String ALL_SPITTERS = "SELECT s FROM Spittle s";
	private static final String SPITTER_FOR_USERNAME = "SELECT s FROM Spitter s WHERE s.username";
	private static final String SPITTLES_BY_USERNAME = "SELECT s FROM Spittle s WHERE s.spitter.username = :username";
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void addSpitter(Spittle spittle) {
		em.persist(spittle);
	}

	@Override
	public Spittle getSpitterById(long id) {
		return em.find(Spittle.class, id);
	}

	@Override
	public void saveSpitter(Spittle spittle) {
		em.merge(spittle);
	}

}
