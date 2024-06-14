package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;


@Component
@Entity
@Table(name = "departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_departamento")
	private int idDepartamento;
	@Column(name = "nombreDpto")
	private String nombreDpto;
	@Column(name = "numeroDpto")
	private String numeroDpto;
	@Column(name = "dniDirector")
	private String dniDirector;
	@Column(name = "fechaIngresoDirector")
	private Date fechaIngresoDirector;
	
	public Departamento() {}

	public Departamento(int idDepartamento,String nombreDpto, String numeroDpto, String dniDirector, Date fechaIngresoDirector) {
		this.idDepartamento = idDepartamento;
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

	public String getNumeroDpto() {
		return numeroDpto;
	}

	public void setNumeroDpto(String numeroDpto) {
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
