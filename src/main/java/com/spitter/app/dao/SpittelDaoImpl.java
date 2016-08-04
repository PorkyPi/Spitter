package com.spitter.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.spitter.app.entity.Spitter;
import com.spitter.app.entity.Spittle;


@Repository
public class SpittelDaoImpl implements SpitterDao {
	private static final String RECENT_SPITTLES = "SELECT s FROM Spittle s";
	
	@PersistenceContext
	private EntityManager em = null;

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

	@Override
	public List<Spittle> getRecentSpittle() {
		return (List<Spittle>) em.createQuery(RECENT_SPITTLES).getResultList();
	}

	@Override
	public void saveSpittle(Spittle spittle) {
		em.persist(spittle);
	}

	@Override
	public Spittle getSpittleById(long id) {
		return em.find(Spittle.class, id);
	}

}
