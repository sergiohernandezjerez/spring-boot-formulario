package com.thefundidors.springboot.formulario.app.services;

import java.util.List;

import com.thefundidors.springboot.formulario.app.models.domain.Pais;

public interface PaisService {
	
	public List<Pais> listar();
	public Pais obtenerPorId(Integer id);

}
