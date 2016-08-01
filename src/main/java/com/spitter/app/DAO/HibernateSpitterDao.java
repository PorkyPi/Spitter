package com.spitter.app.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spitter.app.entity.Spitter;

@Repository
public class HibernateSpitterDao implements SpitterDao {
	private SessionFactory sessionFactory;
	
	@Autowired
	public HibernateSpitterDao(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	private Session currentSession(){
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void addSpitter(Spitter spitter) {
		this.currentSession().save(spitter);
	}

	@Override
	public Spitter getSpitterById(long id) {
		return (Spitter) this.currentSession().get(Spitter.class, id);
	}

	@Override
	public void saveSpitter(Spitter spitter) {
		currentSession().update(spitter);
	}

}
