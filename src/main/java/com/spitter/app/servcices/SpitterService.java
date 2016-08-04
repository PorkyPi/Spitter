package com.spitter.app.servcices;

import java.util.List;

import com.spitter.app.entity.Spitter;
import com.spitter.app.entity.Spittle;

public interface SpitterService {
	public Spitter getSpitterById(long id);
	public void saveSpitter(Spitter spitter);
	
	void saveSpittle(Spittle spittle);
	List<Spittle> getRecentSpittles(int count);
	Spittle getSpittleById(long id);
}
