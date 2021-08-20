package com.thefundidors.springboot.formulario.app.services;

import java.util.List;

import com.thefundidors.springboot.formulario.app.models.domain.Role;

public interface RoleService {
	
	public List<Role> listar();
	public Role obtenerPorId(Integer id);

}
