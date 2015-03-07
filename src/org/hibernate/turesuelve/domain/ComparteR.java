package org.hibernate.turesuelve.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ComparteR implements Serializable{
	private Usuario remitente;
	private Usuario destinatario;
		
	public ComparteR(){}

	public ComparteR(Usuario remitente, Usuario destinatario) {
		super();
		this.remitente = remitente;
		this.destinatario = destinatario;
	}

	
	
	public Usuario getRemitente() {
		return remitente;
	}
	public void setRemitente(Usuario remitente) {
		this.remitente = remitente;
	}
	public Usuario getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(Usuario destinatario) {
		this.destinatario = destinatario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((destinatario == null) ? 0 : destinatario.hashCode());
		result = prime * result
				+ ((remitente == null) ? 0 : remitente.hashCode());
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
		ComparteR other = (ComparteR) obj;
		if (destinatario == null) {
			if (other.destinatario != null)
				return false;
		} else if (!destinatario.equals(other.destinatario))
			return false;
		if (remitente == null) {
			if (other.remitente != null)
				return false;
		} else if (!remitente.equals(other.remitente))
			return false;
		return true;
	}
	
	
}