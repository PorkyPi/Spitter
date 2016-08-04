package com.spitter.app.dao;

import java.util.List;

import com.spitter.app.entity.Spitter;
import com.spitter.app.entity.Spittle;

public interface SpitterDao {
	public void addSpitter(Spitter spitter);
	public Spitter getSpitterById(long id);
	public void saveSpitter(Spitter spitter);
	
	List<Spittle> getRecentSpittle();
	
	void saveSpittle(Spittle spittle);
	Spittle getSpittleById(long id);
}
