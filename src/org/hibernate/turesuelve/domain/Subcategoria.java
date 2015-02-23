package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;

public class Subcategoria extends CategoriaGeneral{
	private Categoria categoria_padre;
	private Set<Promocion> promociones = new HashSet<Promocion>();

	public Subcategoria() {
		super();
	}

	public Subcategoria(String nombre, Categoria categoria) {
		super(nombre);
		this.categoria_padre = categoria;
	}

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}

	public Categoria getCategoria_padre() {
		return categoria_padre;
	}

	public void setCategoria_padre(Categoria categoria_padre) {
		this.categoria_padre = categoria_padre;
	}
	

}
