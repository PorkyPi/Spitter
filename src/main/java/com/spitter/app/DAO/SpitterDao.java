package com.spitter.app.DAO;

import com.spitter.app.entity.Spitter;

public interface SpitterDao {
	public void addSpitter(Spitter spitter);
	public Spitter getSpitterById(long id);
	public void saveSpitter(Spitter spitter);
}
