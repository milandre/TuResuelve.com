import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.turesuelve.domain.Ciudad;
import org.hibernate.turesuelve.domain.Compra;
import org.hibernate.turesuelve.domain.CompraR;
import org.hibernate.turesuelve.domain.Oferta;
import org.hibernate.turesuelve.domain.OfertaR;
import org.hibernate.turesuelve.domain.Promocion;
import org.hibernate.turesuelve.domain.Usuario;
import org.hibernate.turesuelve.domain.TarjetaCredito;
import org.hibernate.turesuelve.domain.Categoria;
import org.hibernate.turesuelve.domain.Subcategoria;
import org.hibernate.turesuelve.domain.Vale;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args){
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		Usuario usuario1 = new Usuario("Andre3","123","Andreina","Marcano", "sciusbvds");
		Usuario usuario2 = new Usuario("Fran45","45637","Francisco","Matute", "sciusbvds");
		
		java.util.Date utilDate = new java.util.Date();
	    java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
		
		//Dos tarjetas
	    TarjetaCredito tarjeta1 = new TarjetaCredito("50284726345","19932833","Andreina","Visa","300", sqlDate);
	    TarjetaCredito tarjeta2 = new TarjetaCredito("37463854984","19932831","Fran","Visa","345", sqlDate);
	    
	    session.save(tarjeta1);
	    session.save(tarjeta2);
	    
	    //Dos ciudades de paises distintos
	    Ciudad ciudad1 = new Ciudad("Barcelona","Espana");
	    Ciudad ciudad2 = new Ciudad("Barcelona","Venezuela");
	    
	    session.save(ciudad1);
	    session.save(ciudad2);
			    
		//Empleado 1 con dos meetings
		usuario1.getTarjetas().add(tarjeta1);
		usuario2.getTarjetas().add(tarjeta2);
		usuario2.getTarjetas().add(tarjeta1);
		
		//Conjunto de amigos
        Set<Usuario> friends = new HashSet<Usuario>();

        friends.add(usuario1);
        friends.add(usuario2);
        
        usuario1.setAmigos(friends);
        
        //Conjunto de ciudades
        Set<Ciudad> ciudades = new HashSet<Ciudad>();
        
        ciudades.add(ciudad1);
        ciudades.add(ciudad2);
        
        usuario1.setCiudades(ciudades);
        
        Categoria cat1 = new Categoria("Comida");
        Categoria cat2 = new Categoria("Entretenimiento");
        
        Subcategoria subcat1 = new Subcategoria("Sushi", cat1);
        Subcategoria subcat2 = new Subcategoria("Cine", cat2);
        session.save(subcat1);
        session.save(subcat2);
        
        cat1.getSubcategorias().add(subcat1);
        cat2.getSubcategorias().add(subcat2);
        session.save(cat1);
        session.save(cat2);
        
	    Promocion prom1 = new Promocion("2x1 en Sushi Market",300.0f, 200.0f,"Oferta", sqlDate, sqlDate, true, subcat1);
	    Promocion prom2 = new Promocion("50% Cines Unidos",400.0f, 300.0f,"Oferta", sqlDate, sqlDate, true, subcat2);
	    session.save(prom1);
	    session.save(prom2);
	    
		session.save(usuario1);
		session.save(usuario2);
		
		Compra compra1 = new Compra(new CompraR(usuario1, prom1));
		Compra compra2 = new Compra(new CompraR(usuario1, prom2));
		Compra compra3 = new Compra(new CompraR(usuario2, prom1));
		session.save(compra1);
		session.save(compra2);
		session.save(compra3);
		
		Oferta oferta1 = new Oferta(new OfertaR(ciudad1, prom1));
		Oferta oferta2 = new Oferta(new OfertaR(ciudad1, prom2));
		Oferta oferta3 = new Oferta(new OfertaR(ciudad2, prom1));
		session.save(oferta1);
		session.save(oferta2);
		session.save(oferta3);
		
		Vale vale1 = new Vale("Sushi1", "Valido", "gamundiaranda@gmail.com", sqlDate, sqlDate, compra1, tarjeta1, oferta1);
		Vale vale2 = new Vale("Sushi2", "Valido", "gamundiaranda@hotmail.com", sqlDate, sqlDate, compra1, tarjeta1, oferta1);
		Vale vale3 = new Vale("Cine", "Fallido", "andreina@gmail.com", sqlDate, sqlDate, compra2, tarjeta1, oferta2);
		Vale vale4 = new Vale("Sushi", "Valido", "marcano@gmail.com", sqlDate, sqlDate, compra3, tarjeta1, oferta3);
		session.save(vale1);
		session.save(vale2);
		session.save(vale3);
		session.save(vale4);

		
		// Promociones de una ciudad
		Query query1 = session.createQuery("select oftr.promocion_ofertada from Oferta as oft join oft.oferta_r as oftr join oftr.ciudad as ciud where ciud.nombre_ciudad = :ciudad and  ciud.nombre_pais = :pais ");
		query1.setParameter("ciudad", "Barcelona");
		query1.setParameter("pais", "Venezuela");
		List<Promocion> prom_ciudad = query1.list();
		
		for(Promocion tarjeta : prom_ciudad) {
            System.out.println(tarjeta.getDescripcion());
        }
		
		
		// Promociones compradas por un usuario
		Query query2 = session.createQuery("select compr.promocion_comprada from Compra as comp join comp.compra_r as compr join compr.comprador as usu where usu.nombre_usuario = :nombre ");
		query2.setParameter("nombre", "Fran45");
		List<Promocion> prom_usuario = query2.list();
		
		for(Promocion tarjeta : prom_usuario) {
            System.out.println(tarjeta.getDescripcion());
        }
		
		
//		// Ciudades con mas promociones
//		Query query3 = session.createQuery("select ciud.nombre_ciudad, ciud.nombre_pais, ciud.usuarios, ciud.promociones from Ciudad as ciud join ciud.promociones as proms order by (count(proms))");
//		List<Ciudad> ciudad_imp = query3.list();
//		
//		for(Ciudad ciudad : ciudad_imp) {
//            System.out.println(ciudad.getNombre_ciudad() + "," + ciudad.getNombre_pais());
//        }
		
		session.getTransaction().commit();
		session.close(); //En create-drop mode, esto permite crear el esquema.
		//sessionFactory.close(); Si estas en create-drop, esto le indica a hibernate q dropea el esquema sin insertar nada. 
	}
}
