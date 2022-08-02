package com.crudincidencias.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudincidencias.dao.IncidenciasDAO;
import com.crudincidencias.dominio.Incidencia;
import com.crudincidencias.dominio.Operador;

@Service
public class IncidenciaServImpl implements IncidenciaServ{

	@Autowired
	IncidenciasDAO incidenciaDao;
	
	@Override
	public void guardar(Incidencia incidencia) {
		incidenciaDao.save(incidencia);
		
	}

	@Override
	public void editar(Incidencia incidencia) {
		incidenciaDao.save(incidencia);
		
	}

	@Override
	public void eliminar(Incidencia incidencia) {
		incidenciaDao.delete(incidencia);
	}

	@Override
	public Incidencia buscar(Incidencia incidencia) {
		
		return incidenciaDao.findById(incidencia.getId_incidencia()).orElse(null);
	}

	@Override
	public List<Incidencia> listar() {
		// TODO Auto-generated method stub
		return (List<Incidencia>) incidenciaDao.findAll();
	}

}
