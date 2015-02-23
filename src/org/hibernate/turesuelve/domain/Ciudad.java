package org.hibernate.turesuelve.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Ciudad implements Serializable{
	
	private String nombre_ciudad;
	private String nombre_pais;
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	private Set<Oferta> promociones = new HashSet<Oferta>();
	
	public Ciudad(){}
	
	public Ciudad(String ciudad, String pais){
		this.nombre_ciudad = ciudad;
		this.nombre_pais = pais;
	}
	
	public String getNombre_ciudad() {
		return nombre_ciudad;
	}
	public void setNombre_ciudad(String nombre_ciudad) {
		this.nombre_ciudad = nombre_ciudad;
	}
	public String getNombre_pais() {
		return nombre_pais;
	}
	public void setNombre_pais(String nombre_pais) {
		this.nombre_pais = nombre_pais;
	}
	public Set<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Set<Usuario> usuarios) {
		this.usuarios = usuarios;
	}
	public Set<Oferta> getPromociones() {
		return promociones;
	}
	public void setPromociones(Set<Oferta> promociones) {
		this.promociones = promociones;
	}
	
	
	
}