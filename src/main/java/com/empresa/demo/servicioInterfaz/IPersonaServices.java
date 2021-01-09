package com.empresa.demo.servicioInterfaz;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.empresa.demo.model.Persona;


@Repository
public interface IPersonaServices {
	
	public List<Persona> listar();
	public Optional<Persona> buscarId(int id);
	public void eliminar(int id);
	public int guardar(Persona p);

}
