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
	private Set<Ciudad> ciudades_ofertadas = new HashSet<Ciudad>();
	
	public Promocion(){}
	
	public Promocion(String desc, Float monto_original, Float monto_oferta, String tipo, Date fecha_inicio, 
			         Date fecha_fin, Boolean es_continuo){
		
		this.descripcion = desc;
		this.monto_original = monto_original;
		this.monto_oferta = monto_oferta;
		this.tipo = tipo;
		this.fecha_inicio_vigencia = fecha_inicio;
		this.fecha_fin_vigencia = fecha_fin;
		this.es_continuo = es_continuo;
		
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
	
	public Set<Ciudad> getCiudades_ofertadas() {
		return ciudades_ofertadas;
	}
	
	public void setCiudades_ofertadas(Set<Ciudad> ciudades_ofertadas) {
		this.ciudades_ofertadas = ciudades_ofertadas;
	}
		
	
	
}