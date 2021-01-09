package com.empresa.demo.servicio;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.demo.interfaz.IPersona;
import com.empresa.demo.model.Persona;
import com.empresa.demo.servicioInterfaz.IPersonaServices;


@Service
public class PersonaServicios implements IPersonaServices{

	@Autowired
	IPersona data;
	
	@Override
	public List<Persona> listar() {
		
		return data.findAll();
	}

	@Override
	public Optional<Persona> buscarId(int id) {
		
		return data.findById(id);
	}

	@Override
	public void eliminar(int id) {
		data.deleteById(id);
		
	}

	@Override
	public int guardar(Persona p) {
		int res=0;
		Persona login=data.save(p);
		if(!login.equals(null)) {
			res=1;
		}
		return res;
	}

}
