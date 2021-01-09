package com.empresa.demo.interfaz;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.demo.model.Persona;

public interface IPersona extends JpaRepository<Persona, Integer>{

}
