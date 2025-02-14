package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteData {

	public static void main(String[] args) {
		
				
		SessionFactory factory=new Configuration()
				.addAnnotatedClass(hibernate.Cricketer.class)
				.configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction trasaction=session.beginTransaction();
		
		Cricketer c1= session.find(Cricketer.class, 33);
		
		session.remove(c1);;
		
		
		
		trasaction.commit();
		
		session.close();
		factory.close();
		
	}

}
