package org.hibernate.turesuelve.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Date;

@SuppressWarnings("serial")
public class Promocion implements Serializable{
	
	private String descripcion;
	private Float monto_original;
	private Float monto_oferta;
	//private Set<String> enlaces = new Set<String>();
	private String tipo;
	private Date fecha_inicio_vigencia;
	private Date fecha_fin_vigencia;
	private Boolean es_continuo;
	//private Set<Date> fechas_canje = new Set<Date>();
	private Set<Oferta> ciudades_ofertadas = new HashSet<Oferta>();
	private Subcategoria subcategoria;
	private Set<Compra> compradores = new HashSet<Compra>();
	
	
	public Promocion(){}
	
	public Promocion(String desc, Float monto_original, Float monto_oferta, String tipo, Date fecha_inicio, 
			         Date fecha_fin, Boolean es_continuo, Subcategoria subcategoria){
		
		this.descripcion = desc;
		this.monto_original = monto_original;
		this.monto_oferta = monto_oferta;
		this.tipo = tipo;
		this.fecha_inicio_vigencia = fecha_inicio;
		this.fecha_fin_vigencia = fecha_fin;
		this.es_continuo = es_continuo;
		this.subcategoria = subcategoria;
		
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String decripcion) {
		this.descripcion = decripcion;
	}
	
	public Float getMonto_original() {
		return monto_original;
	}
	
	public void setMonto_original(Float monto_original) {
		this.monto_original = monto_original;
	}
	
	public Float getMonto_oferta() {
		return monto_oferta;
	}
	
	public void setMonto_oferta(Float monto_oferta) {
		this.monto_oferta = monto_oferta;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Date getFecha_inicio_vigencia() {
		return fecha_inicio_vigencia;
	}
	
	public void setFecha_inicio_vigencia(Date fecha_inicio_vigencia) {
		this.fecha_inicio_vigencia = fecha_inicio_vigencia;
	}
	
	public Date getFecha_fin_vigencia() {
		return fecha_fin_vigencia;
	}
	
	public void setFecha_fin_vigencia(Date fecha_fin_vigencia) {
		this.fecha_fin_vigencia = fecha_fin_vigencia;
	}
	
	public Boolean getEs_continuo() {
		return es_continuo;
	}
	
	public void setEs_continuo(Boolean es_continuo) {
		this.es_continuo = es_continuo;
	}
	
	public Set<Oferta> getCiudades_ofertadas() {
		return ciudades_ofertadas;
	}
	
	public void setCiudades_ofertadas(Set<Oferta> ciudades_ofertadas) {
		this.ciudades_ofertadas = ciudades_ofertadas;
	}

	public Subcategoria getSubcategoria() {
		return subcategoria;
	}

	public void setSubcategoria(Subcategoria subcategoria) {
		this.subcategoria = subcategoria;
	}
	
	public Set<Compra> getCompradores() {
		return compradores;
	}

	public void setCompradores(Set<Compra> compradores) {
		this.compradores = compradores;
	}

	public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
 
        Promocion that = (Promocion) obj;
 
        if (descripcion != null ? !descripcion.equals(that.getDescripcion()) : that.getDescripcion() != null)
        	return false;
        if (fecha_inicio_vigencia != null ? !fecha_inicio_vigencia.equals(that.getFecha_inicio_vigencia()) : that.getFecha_inicio_vigencia() != null)
            return false; 
        if (fecha_fin_vigencia != null ? !fecha_fin_vigencia.equals(that.getFecha_fin_vigencia()) : that.getFecha_fin_vigencia() != null)
            return false; 
        return true;
    }
	
    public int hashCode() {
        int hash;
        hash = (descripcion != null ? descripcion.hashCode() : 0);
        hash = 31 * hash + (fecha_inicio_vigencia != null ? fecha_inicio_vigencia.hashCode() : 0);
        hash = 31 * hash + (fecha_fin_vigencia != null ? fecha_fin_vigencia.hashCode() : 0);
        return hash;
    }
	
}