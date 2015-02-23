package org.hibernate.turesuelve.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CompraR implements Serializable{
	private Usuario comprador;
	private Promocion promocion_comprada;
	
	public CompraR(){}

	public CompraR(Usuario comprador, Promocion promocion_comprada) {
		super();
		this.comprador = comprador;
		this.promocion_comprada = promocion_comprada;
	}

	public Usuario getComprador() {
		return comprador;
	}

	public void setComprador(Usuario comprador) {
		this.comprador = comprador;
	}

	public Promocion getPromocion_comprada() {
		return promocion_comprada;
	}

	public void setPromocion_comprada(Promocion promocion_comprada) {
		this.promocion_comprada = promocion_comprada;
	}
	
	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
 
        CompraR that = (CompraR) obj;
 
        if (comprador != null ? !comprador.equals(that.getComprador()) : that.getComprador() != null)
        	return false;
        if (promocion_comprada != null ? !promocion_comprada.equals(that.getPromocion_comprada()) : that.getPromocion_comprada() != null)
            return false; 
        return true;
    }
	
    public int hashCode() {
        int hash;
        hash = (comprador != null ? comprador.hashCode() : 0);
        hash = 31 * hash + (promocion_comprada != null ? promocion_comprada.hashCode() : 0);
        return hash;
    }
}
