package org.hibernate.turesuelve.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class OfertaR implements Serializable{
	private Ciudad ciudad;
	private Promocion promocion_ofertada;
	
	public OfertaR(){}

	public OfertaR(Ciudad ciudad, Promocion promocion_ofertada) {
		super();
		this.ciudad = ciudad;
		this.promocion_ofertada = promocion_ofertada;
	}


	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}
	
	public Promocion getPromocion_ofertada() {
		return promocion_ofertada;
	}

	public void setPromocion_ofertada(Promocion promocion_ofertada) {
		this.promocion_ofertada = promocion_ofertada;
	}

	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
 
        OfertaR that = (OfertaR) obj;
 
        if (ciudad != null ? !ciudad.equals(that.getCiudad()) : that.getCiudad() != null)
        	return false;
        if (promocion_ofertada != null ? !promocion_ofertada.equals(that.getPromocion_ofertada()) : that.getPromocion_ofertada() != null)
            return false; 
        return true;
    }
	
    public int hashCode() {
        int hash;
        hash = (ciudad != null ? ciudad.hashCode() : 0);
        hash = 31 * hash + (promocion_ofertada != null ? promocion_ofertada.hashCode() : 0);
        return hash;
    }
}
