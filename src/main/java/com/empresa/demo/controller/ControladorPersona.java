package com.empresa.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.demo.model.Persona;
import com.empresa.demo.servicio.PersonaServicios;


@Controller
@RequestMapping
public class ControladorPersona {
	
	@Autowired
	PersonaServicios service;
	
	@GetMapping("/listapersona")
	public String listar(Model model) {
		
		List<Persona> personas=service.listar();
		
		model.addAttribute("personas",personas);
		
		return "personalista";
		
	}
	
	@GetMapping("/nuevapersona")
	public String nuevo(Model model) {
		
		Persona persona=new Persona();
		
		model.addAttribute("persona",persona);
		
		return "personaform";
	}
	
	@PostMapping("/savepersona")
	public String guardar(Persona p) {
		
		service.guardar(p);
		
		return "listo";
	}
	
	@GetMapping("/listo")
	public String listo() {
		return "listo";
	}

}
