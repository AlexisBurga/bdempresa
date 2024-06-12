package com.distribuida.entities;

import java.util.Date;

public class Subordinado {
	
	  private String dniEmpleado; // Assuming Dni is unique identifier
	  private String nombreSubordinado;
	  private char sexo;
	  private Date fechaNac;
	  private String relacion;
	  
	  public Subordinado() {}

	public Subordinado(String dniEmpleado, String nombreSubordinado, char sexo, Date fechaNac, String relacion) {
		
		this.dniEmpleado = dniEmpleado;
		this.nombreSubordinado = nombreSubordinado;
		this.sexo = sexo;
		this.fechaNac = fechaNac;
		this.relacion = relacion;
	}

	public String getDniEmpleado() {
		return dniEmpleado;
	}

	public void setDniEmpleado(String dniEmpleado) {
		this.dniEmpleado = dniEmpleado;
	}

	public String getNombreSubordinado() {
		return nombreSubordinado;
	}

	public void setNombreSubordinado(String nombreSubordinado) {
		this.nombreSubordinado = nombreSubordinado;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getRelacion() {
		return relacion;
	}

	public void setRelacion(String relacion) {
		this.relacion = relacion;
	}
	  
	  

}
