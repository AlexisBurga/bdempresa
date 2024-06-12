package com.distribuida.dao;

import java.util.List;


import com.distribuida.entities.Localizaciondpt;

public interface LocalizaciondptDao {
	
	
	public List<Localizaciondpt>findAll();
	public Localizaciondpt findOne(int id);
	public void add(Localizaciondpt localizaciondpt);
	public void up(Localizaciondpt localizaciondpt);
	public void del(int id);
	

}
