package com.spitter.app.services;

import java.util.List;
import com.spitter.app.DAO.SpitterDao;
import com.spitter.app.entity.Spittle;

public class SpitterServiceImpl implements SpitterService {
	
	SpitterDao spitterDao;
	
	public SpitterDao getSpitterDao() {
		return spitterDao;
	}
	public void setSpitterDao(SpitterDao spitterDao) {
		this.spitterDao = spitterDao;
	}
	
	@Override
	public void saveSpittle(Spittle spittle) {
		this.spitterDao.saveSpitter(spittle);
	}
	@Override
	public List<Spittle> getRecentSpittles(int spitters) {
		return null;
	}
}
