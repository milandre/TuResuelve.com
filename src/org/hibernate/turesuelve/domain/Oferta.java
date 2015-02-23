package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Oferta implements Serializable{
	private OfertaR oferta_r;
	private Set<Vale> vales = new HashSet<Vale>();
	
	public Oferta(){}

	public Oferta(OfertaR oferta_r) {
		super();
		this.oferta_r = oferta_r;
	}

	public OfertaR getOferta_r() {
		return oferta_r;
	}

	public void setOferta_r(OfertaR oferta_r) {
		this.oferta_r = oferta_r;
	}

	public Set<Vale> getVales() {
		return vales;
	}

	public void setVales(Set<Vale> vales) {
		this.vales = vales;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
 
        Oferta that = (Oferta) obj;
 
        if (oferta_r != null ? !oferta_r.equals(that.getOferta_r()) : that.getOferta_r() != null)
        	return false;
        if (vales != null ? !vales.equals(that.getVales()) : that.getVales() != null)
            return false; 
        return true;
    }
	
    public int hashCode() {
        int hash;
        hash = (oferta_r != null ? oferta_r.hashCode() : 0);
        hash = 31 * hash + (vales != null ? vales.hashCode() : 0);
        return hash;
    }
	
}
