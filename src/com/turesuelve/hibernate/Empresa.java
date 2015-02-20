package com.turesuelve.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Empresa {
	
	private String nombre_empresa;
	private String telefono;
	private String direccion;
	private Integer nro_estimado_clientes;
	private Set<Promocion> promociones_lanzadas = new HashSet<Promocion>();
		
	
	
}