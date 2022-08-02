package com.crudincidencias.dao;

import org.springframework.data.repository.CrudRepository;

import com.crudincidencias.dominio.Incidencia;

public interface IncidenciasDAO extends CrudRepository<Incidencia, Integer>{

}
