package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "optometras")
public class optometra {
	
	@Id
	@Column(name="cod-Opt")
	private int codigo;
	
	@Column(name="nom-Opt")
	private String nombre;
	
	@Column(name="tel-Opt")
	private int telefono;
	
	@Column(name="cor-Opt")
	private String correo;
	
	@Column(name="dir-Opt")
	private String direccion;
	
	@Column(name="gen-Opt")
	private String genero;
	
	@Column(name="con-Opt")
	private String contraseña;
	
	public optometra(int codigo, String nombre, int telefono, String correo, String direccion, String genero,
			String contraseña) {
		
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.genero = genero;
		this.contraseña = contraseña;
	}

	public optometra() {
	
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	

}
