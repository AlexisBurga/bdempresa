package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int idDepartamento;
	@Column(name = "nombreDpto")
	private String nombreDpto;
	@Column(name = "numeroDpt")
	private int numeroDpto;
	@Column(name = "dniDirector")
	private String dniDirector;
	@Column(name = "fechaIngresoDirector")
	private Date fechaIngresoDirector;
	
	public Departamento() {}

	public Departamento(String nombreDpto, int numeroDpto, String dniDirector, Date fechaIngresoDirector) {
		
		this.nombreDpto = nombreDpto;
		this.numeroDpto = numeroDpto;
		this.dniDirector = dniDirector;
		this.fechaIngresoDirector = fechaIngresoDirector;
	}

	public String getNombreDpto() {
		return nombreDpto;
	}

	public void setNombreDpto(String nombreDpto) {
		this.nombreDpto = nombreDpto;
	}

	public int getNumeroDpto() {
		return numeroDpto;
	}

	public void setNumeroDpto(int numeroDpto) {
		this.numeroDpto = numeroDpto;
	}

	public String getDniDirector() {
		return dniDirector;
	}

	public void setDniDirector(String dniDirector) {
		this.dniDirector = dniDirector;
	}

	public Date getFechaIngresoDirector() {
		return fechaIngresoDirector;
	}

	public void setFechaIngresoDirector(Date fechaIngresoDirector) {
		this.fechaIngresoDirector = fechaIngresoDirector;
	}

	@Override
	public String toString() {
		return "Departamento [idDepartamento=" + idDepartamento + ", nombreDpto=" + nombreDpto + ", numeroDpto="
				+ numeroDpto + ", dniDirector=" + dniDirector + ", fechaIngresoDirector=" + fechaIngresoDirector + "]";
	}
	
	
}
