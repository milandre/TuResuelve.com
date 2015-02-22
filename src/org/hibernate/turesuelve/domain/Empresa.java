package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
	
	private String nombre_empresa;
	private String telefono;
	private String direccion;
	private Integer nro_estimado_clientes;
	private Set<Promocion> promociones_lanzadas = new HashSet<Promocion>();
	
	public String getNombre_empresa() {
		return nombre_empresa;
	}
	public void setNombre_empresa(String nombre_empresa) {
		this.nombre_empresa = nombre_empresa;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getNro_estimado_clientes() {
		return nro_estimado_clientes;
	}
	public void setNro_estimado_clientes(Integer nro_estimado_clientes) {
		this.nro_estimado_clientes = nro_estimado_clientes;
	}
	public Set<Promocion> getPromociones_lanzadas() {
		return promociones_lanzadas;
	}
	public void setPromociones_lanzadas(Set<Promocion> promociones_lanzadas) {
		this.promociones_lanzadas = promociones_lanzadas;
	}
		
	
	
}