package com.distribuida.entities;

public class Proyecto {

	
	
	  private int numProyecto;
	  private String nombreProyecto;
	  private String ubicacionProyecto;
	  private int numDptoProyecto;
	  
	  public Proyecto() {}

	public Proyecto(int numProyecto, String nombreProyecto, String ubicacionProyecto, int numDptoProyecto) {
	
		this.numProyecto = numProyecto;
		this.nombreProyecto = nombreProyecto;
		this.ubicacionProyecto = ubicacionProyecto;
		this.numDptoProyecto = numDptoProyecto;
	}

	public int getNumProyecto() {
		return numProyecto;
	}

	public void setNumProyecto(int numProyecto) {
		this.numProyecto = numProyecto;
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public void setNombreProyecto(String nombreProyecto) {
		this.nombreProyecto = nombreProyecto;
	}

	public String getUbicacionProyecto() {
		return ubicacionProyecto;
	}

	public void setUbicacionProyecto(String ubicacionProyecto) {
		this.ubicacionProyecto = ubicacionProyecto;
	}

	public int getNumDptoProyecto() {
		return numDptoProyecto;
	}

	public void setNumDptoProyecto(int numDptoProyecto) {
		this.numDptoProyecto = numDptoProyecto;
	}
	  
	  
}
