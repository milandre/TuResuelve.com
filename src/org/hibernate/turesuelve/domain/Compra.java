package org.hibernate.turesuelve.domain;

import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Compra implements Serializable{
	private CompraR compra_r;
	private Set<Vale> vales = new HashSet<Vale>();
	
	public Compra(){}

	public Compra(CompraR compra_r) {
		super();
		this.compra_r = compra_r;
	}

	public CompraR getCompra_r() {
		return compra_r;
	}

	public void setCompra_r(CompraR compra_r) {
		this.compra_r = compra_r;
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
 
        Compra that = (Compra) obj;
 
        if (compra_r != null ? !compra_r.equals(that.getCompra_r()) : that.getCompra_r() != null)
        	return false;
        if (vales != null ? !vales.equals(that.getVales()) : that.getVales() != null)
            return false; 
        return true;
    }
	
    public int hashCode() {
        int hash;
        hash = (compra_r != null ? compra_r.hashCode() : 0);
        hash = 31 * hash + (vales != null ? vales.hashCode() : 0);
        return hash;
    }
	
}
