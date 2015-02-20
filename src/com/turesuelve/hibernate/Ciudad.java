package com.turesuelve.hibernate;

import java.util.HashSet;
import java.util.Set;

public class Ciudad {
	
	private String nombre_ciudad;
	private String nombre_pais;
	private Set<Usuario> usuarios = new HashSet<Usuario>();
	private Set<Promocion> promociones = new HashSet<Promocion>();
	
	
	
}