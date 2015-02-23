package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;

public class Categoria extends CategoriaGeneral{
	
	private Set<Subcategoria> subcategorias = new HashSet<Subcategoria>();
	
	public Set<Subcategoria> getSubcategorias() {
		return subcategorias;
	}
	public void setSubcategorias(Set<Subcategoria> subcategorias) {
		this.subcategorias = subcategorias;
	}

}
