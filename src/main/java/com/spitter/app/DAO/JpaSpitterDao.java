package com.spitter.app.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.spitter.app.entity.Spitter;

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
	public void addSpitter(Spitter spitter) {
		em.persist(spitter);
	}

	@Override
	public Spitter getSpitterById(long id) {
		return em.find(Spitter.class, id);
	}

	@Override
	public void saveSpitter(Spitter spitter) {
		em.merge(spitter);
	}

}
