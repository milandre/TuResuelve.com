package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;

public class CategoriaGeneral {
	
	private String nombre_categoria; 
	private Set<Empresa> empresas = new HashSet<Empresa>();
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	
	public CategoriaGeneral(){}
	
	public CategoriaGeneral(String nombre){
		
		this.nombre_categoria = nombre;
	}
		
	public String getNombre_categoria() {
		return nombre_categoria;
	}
	public void setNombre_categoria(String nombre_categoria) {
		this.nombre_categoria = nombre_categoria;
	}
	public Set<Empresa> getEmpresas() {
		return empresas;
	}
	public void setEmpresas(Set<Empresa> empresas) {
		this.empresas = empresas;
	}
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
