package com.edu.sena.models.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "clientes")
public class cliente {
	
	
	  @Id
	  @Column(name = "cod_Cli")
	  private int codigo;
	  
	  @Column(name = "nam_Cli")
	  private String nombre;
	  
	  @Column(name = "doc_Cli")
	  private String tipo_documento;
	  
	  @Column(name = "docnu_Cli")
	  private int numero_de_documento;
	  
	  @Column(name = "gen_Cli")
	  private String genero;
	  
	  @Column(name = "tel_Cli")
	  private int telefono;
	  
	  @Column(name = "dir_Cli")
	  private String direccion;
	  
	  @Column(name = "cor_Cli")
	  private String correo;
	  
	  @Column(name = "esta_Cli")
	  private String estado_civil;
	  
	  @Column(name = "nacim_Cli")
	  private Date fecha_de_nacimiento;
	  
	  @Column(name = "eps_Cli")
	  private String EPS;
	  
	  @Column(name = "cont_Cli")
	  private String contraseña;
	
	  public cliente(int codigo, String nombre, String tipo_documento, int numero_de_documento, String genero,
			int telefono, String direccion, String correo, String estado_civil, Date fecha_de_nacimiento, String ePS,
			String contraseña) {
		  
	
		this.codigo = codigo;
		this.nombre = nombre;
		this.tipo_documento = tipo_documento;
		this.numero_de_documento = numero_de_documento;
		this.genero = genero;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.estado_civil = estado_civil;
		this.fecha_de_nacimiento = fecha_de_nacimiento;
		EPS = ePS;
		this.contraseña = contraseña;
	}

	public cliente() {
		
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

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public int getNumero_de_documento() {
		return numero_de_documento;
	}

	public void setNumero_de_documento(int numero_de_documento) {
		this.numero_de_documento = numero_de_documento;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public Date getFecha_de_nacimiento() {
		return fecha_de_nacimiento;
	}

	public void setFecha_de_nacimiento(Date fecha_de_nacimiento) {
		this.fecha_de_nacimiento = fecha_de_nacimiento;
	}

	public String getEPS() {
		return EPS;
	}

	public void setEPS(String ePS) {
		EPS = ePS;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	

	
	
	
	
	  
	  
	  

}

