package com.empresa.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	@GeneratedValue
	private int id_persona;
	@Column(name="nombre",length=45)
	private String nombre;
	@Column(name="apellido",length=45)
	private String apellido;
	@Column(name="telefono")
	private int telefono;
	@Column(name="direccion",length=100)
	private String direccion;
	@Column(name="dni",length=8)
	private int dni;
	@Column(name="contrasena",length=10)
	private String contrasena;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public Persona(int id_persona, String nombre, String apellido, int telefono, String direccion, int dni, String contrasena) {
		super();
		this.id_persona = id_persona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.dni = dni;
		this.contrasena = contrasena;
	}

	public int getId_persona() {
		return id_persona;
	}

	public void setId_persona(int id_persona) {
		this.id_persona = id_persona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	
	

}
