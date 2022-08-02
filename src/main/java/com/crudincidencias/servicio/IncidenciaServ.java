package com.crudincidencias.servicio;

import java.util.List;

import com.crudincidencias.dominio.Incidencia;


public interface IncidenciaServ {

	public void guardar(Incidencia incidencia);
	public void editar(Incidencia incidencia);
	public void eliminar(Incidencia incidencia);
	public Incidencia buscar(Incidencia incidencia);
	
	public List<Incidencia> listar();
}
