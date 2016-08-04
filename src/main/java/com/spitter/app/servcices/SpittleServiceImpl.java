package com.spitter.app.servcices;

import java.sql.Date;
import java.time.LocalDate;
import java.util.*;

import javax.inject.Inject;
import javax.inject.Named;

import com.spitter.app.dao.SpitterDao;
import com.spitter.app.entity.Spitter;
import com.spitter.app.entity.Spittle;

@Named
public class SpittleServiceImpl implements SpitterService {
	
	@Inject
	private SpitterDao spitterDao;

	@Override
	public Spitter getSpitterById(long id) {
		return spitterDao.getSpitterById(id);
	}

	public void saveSpitter(Spitter spitter) {
		if(spitter.getSpitterId() == 0) {
		      spitterDao.addSpitter(spitter);
		    } else {
		      spitterDao.saveSpitter(spitter);
		    }
	}

	@Override
	public void saveSpittle(Spittle spittle) {
		spittle.setWhen(Date.valueOf(LocalDate.now()));
	    spitterDao.saveSpittle(spittle);
	}

	@Override
	public List<Spittle> getRecentSpittles(int count) {
		List<Spittle> recentSpittles = spitterDao.getRecentSpittle();    
		java.util.Collections.reverse(recentSpittles);
		return recentSpittles.subList(0, count);
	}

	@Override
	public Spittle getSpittleById(long id) {
		return spitterDao.getSpittleById(id);
	}
}
