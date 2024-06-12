package com.distribuida.entities;

public class Localizaciondpt {

	
	private int numeroDpto;
	private String ubicacionDpto;
	
	public Localizaciondpt() {}

	public Localizaciondpt(int numeroDpto, String ubicacionDpto) {
		
		this.numeroDpto = numeroDpto;
		this.ubicacionDpto = ubicacionDpto;
	}

	public int getNumeroDpto() {
		return numeroDpto;
	}

	public void setNumeroDpto(int numeroDpto) {
		this.numeroDpto = numeroDpto;
	}

	public String getUbicacionDpto() {
		return ubicacionDpto;
	}

	public void setUbicacionDpto(String ubicacionDpto) {
		this.ubicacionDpto = ubicacionDpto;
	}
	
}
