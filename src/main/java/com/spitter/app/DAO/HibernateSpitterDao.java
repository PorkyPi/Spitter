package com.spitter.app.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spitter.app.entity.* ;

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
	public void addSpitter(Spittle spittle) {
		this.currentSession().save(spittle);
	}

	@Override
	public Spittle getSpitterById(long id) {
		return (Spittle) this.currentSession().get(Spittle.class, id);
	}

	@Override
	public void saveSpitter(Spittle spittle) {
		currentSession().update(spittle);
	}

}
