package com.spitter.app.DAO;

import com.spitter.app.entity.*;

public interface SpitterDao {
	public void addSpitter(Spittle spittle);
	public Spittle getSpitterById(long id);
	public void saveSpitter(Spittle spittle);
}
