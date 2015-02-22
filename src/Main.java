import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.turesuelve.domain.Ciudad;
import org.hibernate.turesuelve.domain.Usuario;
import org.hibernate.turesuelve.domain.TarjetaCredito;



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
	    
	    //Dos ciudades de paises distintos
	    Ciudad ciudad1 = new Ciudad("Barcelona","Espana");
	    Ciudad ciudad2 = new Ciudad("Barcelona","Venezuela");
			    
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
        usuario1.setCiudades(ciudades);
        
        
        
        
			    
		session.save(usuario1);
		session.save(usuario2);
		
		session.getTransaction().commit();
		session.close(); //En create-drop mode, esto permite crear el esquema.
		//sessionFactory.close(); Si estas en create-drop, esto le indica a hibernate q dropea el esquema sin insertar nada. 
	}
}
