package com.crudincidencias.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crudincidencias.dominio.Incidencia;
import com.crudincidencias.servicio.IncidenciaServ;


@RestController
@RequestMapping("IncidenciaWS")
@CrossOrigin
public class IncidenciaWS {

	@Autowired
	
	IncidenciaServ incidenciaServ;
	
	@GetMapping("listar")
	public List<Incidencia> listar(){
		List<Incidencia> lista = incidenciaServ.listar();
		
		return lista;
}
	@PostMapping("buscar")
	public Incidencia buscar(@RequestBody Incidencia incidencia) {
		return incidenciaServ.buscar(incidencia);
	}
	
}
