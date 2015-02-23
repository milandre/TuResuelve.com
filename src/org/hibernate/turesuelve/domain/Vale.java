package org.hibernate.turesuelve.domain;

import java.util.Date;

public class Vale {

	private String codigo_vale;
	private String info_promocion;
	private String correo_electronico_vale;
	private Date fecha_envio;
	private Date fecha_compra;
	private TarjetaCredito tarjeta_credito;
	//private Compra compra_perteneciente;
	
	public Vale(String codigo_vale, String info_promocion, String correo_electronico_vale, 
			Date fecha_envio, Date fecha_compra) {
		this.codigo_vale = codigo_vale;
		this.info_promocion = info_promocion;
		this.correo_electronico_vale = correo_electronico_vale;
		this.fecha_envio = fecha_envio;
		this.fecha_compra = fecha_compra;
	}
	
	public String getCodigo_vale() {
		return codigo_vale;
	}
	
	public void setCodigo_vale(String codigo_vale) {
		this.codigo_vale = codigo_vale;
	}
	
	public String getInfo_promocion() {
		return info_promocion;
	}
	
	public void setInfo_promocion(String info_promocion) {
		this.info_promocion = info_promocion;
	}
	
	public String getCorreo_electronico_vale() {
		return correo_electronico_vale;
	}
	
	public void setCorreo_electronico_vale(String correo_electronico_vale) {
		this.correo_electronico_vale = correo_electronico_vale;
	}
	
	public Date getFecha_envio() {
		return fecha_envio;
	}
	
	public void setFecha_envio(Date fecha_envio) {
		this.fecha_envio = fecha_envio;
	}
	
	public Date getFecha_compra() {
		return fecha_compra;
	}
	
	public void setFecha_compra(Date fecha_compra) {
		this.fecha_compra = fecha_compra;
	}
	
	public TarjetaCredito getTarjeta_credito() {
		return tarjeta_credito;
	}
	
	public void setTarjeta_credito(TarjetaCredito tarjeta_credito) {
		this.tarjeta_credito = tarjeta_credito;
	}

	//public Compra getCompra_perteneciente() {
		//return compra_perteneciente;
	//}

	//public void setCompra_perteneciente(Compra compra_perteneciente) {
		//this.compra_perteneciente = compra_perteneciente;
	//}
	
}
