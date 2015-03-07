package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Comparte implements Serializable{
	private ComparteR comparte_r;
	private Set<Promocion> promociones = new HashSet<Promocion>();
	
	public Comparte(){}

	public Comparte(ComparteR comparte_r) {
		super();
		this.comparte_r = comparte_r;
	}

	public ComparteR getComparte_r() {
		return comparte_r;
	}

	public void setComparte_r(ComparteR comparte_r) {
		this.comparte_r = comparte_r;
	}

	public Set<Promocion> getPromociones() {
		return promociones;
	}

	public void setPromociones(Set<Promocion> promociones) {
		this.promociones = promociones;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((comparte_r == null) ? 0 : comparte_r.hashCode());
		result = prime * result
				+ ((promociones == null) ? 0 : promociones.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Comparte other = (Comparte) obj;
		if (comparte_r == null) {
			if (other.comparte_r != null)
				return false;
		} else if (!comparte_r.equals(other.comparte_r))
			return false;
		if (promociones == null) {
			if (other.promociones != null)
				return false;
		} else if (!promociones.equals(other.promociones))
			return false;
		return true;
	}
}