import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
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
		Usuario usuario2 = new Usuario("Andre45","45637","Andreina","Marcano", "sciusbvds");
		
		//usuario1.setNombre_usuario("Andre3");
		
		session.save(usuario1);
		session.save(usuario2);
		
		session.getTransaction().commit();
		session.close(); //En create-drop mode, esto permite crear el esquema.
		//sessionFactory.close(); Si estas en create-drop, esto le indica a hibernate q dropea el esquema sin insertar nada. 
		
	}
}
