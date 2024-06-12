package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Empleado;


public interface EmpleadoDao {

	


		
		public List<Empleado>findAll();
		public void add(Empleado empleado);
		public void up(Empleado empleado);
		public void del(int id);
		Empleado findOne(int id);
		
		
}
