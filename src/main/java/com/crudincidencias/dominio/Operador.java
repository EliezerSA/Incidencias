package com.crudincidencias.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "OPERADOR")
public class Operador {

	/*CREATE TABLE OPERADOR(
ID_OPERADOR NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100),
APATERNO NVARCHAR2(100),
AMATERNO NVARCHAR2(100)
);*/

	
	@Id
	int id_operador;
	String nombre;
	String apaterno;
	String amaterno;
	
	
	@OneToMany(mappedBy = "operador", cascade = CascadeType.ALL) // laconexion en cascada con el conexto onoTOMany 
	List<Incidencia> lista = new ArrayList<Incidencia>();


	public Operador() {
		
	}


	
	public Operador(int id_operador, String nombre, String apaterno, String amaterno, List<Incidencia> lista) {
		
		this.id_operador = id_operador;
		this.nombre = nombre;
		this.apaterno = apaterno;
		this.amaterno = amaterno;
		this.lista = lista;
	}


	@Override
	public String toString() {
		return "Operador [id_operador=" + id_operador + ", nombre=" + nombre + ", apaterno=" + apaterno + ", amaterno="
				+ amaterno + ", lista=" + lista + "]\n";
	}



	public int getId_operador() {
		return id_operador;
	}



	public void setId_operador(int id_operador) {
		this.id_operador = id_operador;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApaterno() {
		return apaterno;
	}



	public void setApaterno(String apaterno) {
		this.apaterno = apaterno;
	}



	public String getAmaterno() {
		return amaterno;
	}



	public void setAmaterno(String amaterno) {
		this.amaterno = amaterno;
	}



	public List<Incidencia> getLista() {
		return lista;
	}



	public void setLista(List<Incidencia> lista) {
		this.lista = lista;
	}
	
	
	
}
