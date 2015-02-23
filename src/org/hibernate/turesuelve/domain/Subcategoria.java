package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;

public class Subcategoria extends CategoriaGeneral{
	
	private Set<Promocion> promociones = new HashSet<Promocion>();

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}
	

}
