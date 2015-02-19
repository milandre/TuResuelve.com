package com.turesuelve.hibernate;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;


public class TarjetaCredito {
	
	private String numero_tarjeta;
	private String id_titular;
	private String nombre_titular;
	private String tipo_tarjeta;
	private String codigo_validacion;
	private Date fecha_vencimiento;
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	
	
	public TarjetaCredito(String nro_tarjeta, String id_titular) {
        this.numero_tarjeta = nro_tarjeta;
        this.id_titular = id_titular;
    }
		
	public String getNumero_tarjeta() {
		return numero_tarjeta;
	}
	public void setNumero_tarjeta(String numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}
	public String getId_titular() {
		return id_titular;
	}
	public void setId_titular(String id_titular) {
		this.id_titular = id_titular;
	}
	public String getNombre_titular() {
		return nombre_titular;
	}
	public void setNombre_titular(String nombre_titular) {
		this.nombre_titular = nombre_titular;
	}
	public String getTipo_tarjeta() {
		return tipo_tarjeta;
	}
	public void setTipo_tarjeta(String tipo_tarjeta) {
		this.tipo_tarjeta = tipo_tarjeta;
	}
	public String getCodigo_validacion() {
		return codigo_validacion;
	}
	public void setCodigo_validacion(String codigo_validacion) {
		this.codigo_validacion = codigo_validacion;
	}
	public Date getFecha_vencimiento() {
		return fecha_vencimiento;
	}
	public void setFecha_vencimiento(Date fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
	}
		
	public Set<Usuario> getUsuarios(){
		
		return usuarios;
	}
}
