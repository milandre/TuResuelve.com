package com.turesuelve.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Promocion {
	
	private String decripcion;
	private Float monto_original;
	private Float monto_oferta;
	//private Set<String> enlaces = new Set<String>();
	private String tipo;
	private Date fecha_inicio_vigencia;
	private Date fecha_fin_vigencia;
	private Bool es_continuo;
	//private Set<Date> fechas_canje = new Set<Date>();
	private Set<Ciudad> ciudades_ofertadas = new HashSet<Ciudad>();
		
	
	
}