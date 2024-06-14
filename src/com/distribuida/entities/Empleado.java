package com.distribuida.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "EMPLEADO")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private int idEmpleado;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido1")
    private String apellido1;

    @Column(name = "Apellido2")
    private String apellido2;

    @Column(name = "Dni", unique = true, nullable = false)
    private String dni;

    @Column(name = "FechaNac", nullable = false)
    private Date fechaNac;

    @Column(name = "Direccion", nullable = false)
    private String direccion;

    @Column(name = "Sexo", nullable = false)
    private char sexo;

    @Column(name = "Sueldo", nullable = false)
    private double sueldo;

    @Column(name = "SuperDni")
    private String superDni;

    @Column(name = "Dno", nullable = false)
    private int dno;



 

    // Constructor vacío
    public Empleado() {
    }

    // Constructor con todos los campos
    public Empleado(int idEmpleado, String nombre, String apellido1, String apellido2, String dni, Date fechaNac,
            String direccion, char sexo, double sueldo, String superDni, int dno) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
        this.sexo = sexo;
        this.sueldo = sueldo;
        this.superDni = superDni;
        this.dno = dno;


    }

    // Getters and setters
    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getSuperDni() {
        return superDni;
    }

    public void setSuperDni(String superDni) {
        this.superDni = superDni;
    }

    public int getDno() {
        return dno;
    }

    public void setDno(int dno) {
        this.dno = dno;
    }



  


	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
				+ apellido2 + ", dni=" + dni + ", fechaNac=" + fechaNac + ", direccion=" + direccion + ", sexo=" + sexo
				+ ", sueldo=" + sueldo + ", superDni=" + superDni + ", dno=" + dno + "]";
	}

	
	  
}
