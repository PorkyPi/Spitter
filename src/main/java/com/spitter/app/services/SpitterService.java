package com.spitter.app.services;

import java.util.List;
import com.spitter.app.entity.Spittle;

public interface SpitterService {
	public void saveSpittle(Spittle spittle);
	public List<Spittle> getRecentSpittles(int spitters);
}
