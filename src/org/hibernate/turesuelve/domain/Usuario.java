package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;

public class Usuario {
	
	private String nombre_usuario;
	private String clave;
	private String nombre;
	private String apellido;
	private String correo_electronico_usuario;
	private Float dinero_promocion;
	private Set<String> redes_sociales = new HashSet<String>();
	private Set<TarjetaCredito> tarjetas = new HashSet<TarjetaCredito>();
	private Set<Ciudad> ciudades = new HashSet<Ciudad>();
	private Set<Usuario> principales = new HashSet<Usuario>();
    private Set<Usuario> amigos = new HashSet<Usuario>();
	
	public Usuario(){}	
	
	public Usuario(String nombre_usuario, String clave, String nombre, String apellido, String correo) {
        this.nombre_usuario = nombre_usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo_electronico_usuario = correo;
    }
	
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

	public Set<String> getRedes_sociales() {
		return redes_sociales;
	}

	public void setRedes_sociales(Set<String> redes_sociales) {
		this.redes_sociales = redes_sociales;
	} 
	
	public void addRedSocial(String red){
		
		this.redes_sociales.add(red);
	}

	public Set<Usuario> getPrincipales() {
		return principales;
	}

	public void setPrincipales(Set<Usuario> principales) {
		this.principales = principales;
	}

	public Set<Usuario> getAmigos() {
		return amigos;
	}

	public void setAmigos(Set<Usuario> amigos) {
		this.amigos = amigos;
	}
	
}
