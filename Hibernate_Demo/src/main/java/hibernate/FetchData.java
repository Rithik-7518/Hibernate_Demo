package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
		
		SessionFactory factory=new Configuration()
				.addAnnotatedClass(hibernate.Cricketer.class)
				.configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		
		// eager fetching ---> get and find
		
		Cricketer c1=session.get(Cricketer.class, 7);
		//Cricketer c1=session.find(Cricketer.class, 18);
		
		// lazy fetching ---> byId
		
		//Cricketer c1=session.byId(Cricketer.class).load(3);
		//Cricketer c1=session.byId(Cricketer.class).getReference(8);
		//System.out.println(c1);
	
		
		session.close();
		factory.close();
		
	}

}
