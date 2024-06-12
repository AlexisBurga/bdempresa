package com.distribuida.entities;

public class Trabajaen {

	
	  private String dniEmpleado;
	  private int numProy;
	  private String horas; 
	  
	  public Trabajaen() {}

	public Trabajaen(String dniEmpleado, int numProy, String horas) {
		
		this.dniEmpleado = dniEmpleado;
		this.numProy = numProy;
		this.horas = horas;
	}

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public int getNumProy() {
		return numProy;
	}

	public void setNumProy(int numProy) {
		this.numProy = numProy;
	}

	public String getHoras() {
		return horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}
	  

}
