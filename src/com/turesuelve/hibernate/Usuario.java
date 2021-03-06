package com.turesuelve.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
	
	private String nombre_usuario;
	private String clave;
	private String nombre;
	private String apellido;
	private String correo_electronico_usuario;
	private Float dinero_promocion;
	private Set<TarjetaCredito> tarjetas = new HashSet<TarjetaCredito>();
	private Set<Ciudad> ciudades = new HashSet<Ciudad>();
	
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
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
	public String getCorreo_electronico_usuario() {
		return correo_electronico_usuario;
	}
	public void setCorreo_electronico_usuario(String correo_electronico_usuario) {
		this.correo_electronico_usuario = correo_electronico_usuario;
	}
	public Float getDinero_promocion() {
		return dinero_promocion;
	}
	public void setDinero_promocion(Float dinero_promocion) {
		this.dinero_promocion = dinero_promocion;
	}
	public Set<TarjetaCredito> getTarjetas() {
		return tarjetas;
	}
	public void setTarjetas(Set<TarjetaCredito> tarjetas) {
		this.tarjetas = tarjetas;
	} 
	public Set<Ciudad> getCiudades() {
		return ciudades;
	}
	public void setCiudades(Set<Ciudad> ciudades) {
		this.ciudades = ciudades;
	} 
	
	
}
