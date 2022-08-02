package com.crudincidencias.dominio;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "INCIDENCIAS")
public class Incidencia {

	/*
	 * CREATE TABLE INCIDENCIAS (
ID_INCIDENCIA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2 (100),
TIPO NVARCHAR2 (100),
FECHA_INCIDENCIA DATE,
ID_OPERADOR NUMBER,
CONSTRAINT FK_INCIDENCIAS_OPERADOR FOREIGN KEY(ID_OPERADOR)REFERENCES OPERADOR(ID_OPERADOR)
);*/
	@Id
	int id_incidencia;
	String nombre;
	String fecha_incidencia;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_OPERADOR")
	Operador operador;

	public Incidencia() {
		super();
	}

	public Incidencia(int id_incidencia, String nombre, String fecha_incidencia, Operador operador) {
		super();
		this.id_incidencia = id_incidencia;
		this.nombre = nombre;
		this.fecha_incidencia = fecha_incidencia;
		this.operador = operador;
	}

	@Override
	public String toString() {
		return "Incidencia [id_incidencia=" + id_incidencia + ", nombre=" + nombre + ", fecha_incidencia="
				+ fecha_incidencia + ", operador=" + operador + "]\n";
	}

	public int getId_incidencia() {
		return id_incidencia;
	}

	public void setId_incidencia(int id_incidencia) {
		this.id_incidencia = id_incidencia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha_incidencia() {
		return fecha_incidencia;
	}

	public void setFecha_incidencia(String fecha_incidencia) {
		this.fecha_incidencia = fecha_incidencia;
	}

	public Operador getOperador() {
		return operador;
	}

	public void setOperador(Operador operador) {
		this.operador = operador;
	}
	
	
	
	
}
