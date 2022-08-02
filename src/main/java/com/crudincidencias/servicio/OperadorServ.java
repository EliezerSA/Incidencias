package com.crudincidencias.servicio;

import java.util.List;

import com.crudincidencias.dominio.Operador;


public interface OperadorServ {


	public void guardar(Operador operadorObj);
	public void editar(Operador operadorObj);
	public void eliminar(Operador operadorObj);

	public Operador buscar(Operador operadorObj);
	public List<Operador> listar();
}
