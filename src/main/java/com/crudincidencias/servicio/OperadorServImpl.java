package com.crudincidencias.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crudincidencias.dao.OperadorDAO;
import com.crudincidencias.dominio.Operador;

//Marcar el servicio
@Service
public class OperadorServImpl implements OperadorServ{

	@Autowired
	
	OperadorDAO operadorDao;
	@Override
	public void guardar(Operador operadorObj) {
		
		operadorDao.save(operadorObj);
	}

	@Override
	public void editar(Operador operadorObj) {
		operadorDao.save(operadorObj);
		
	}

	@Override
	public void eliminar(Operador operadorObj) {
		operadorDao.delete(operadorObj);
		
	}

	@Override
	public Operador buscar(Operador operadorObj) {
		// TODO Auto-generated method stub
		return operadorDao.findById(operadorObj.getId_operador()).orElse(null);
	}

	@Override
	public List<Operador> listar() {
		// TODO Auto-generated method stub

		return (List<Operador>) operadorDao.findAll();
	}

}
