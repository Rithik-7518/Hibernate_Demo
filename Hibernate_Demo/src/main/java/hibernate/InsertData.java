package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertData {

	public static void main(String[] args) {
		Cricketer c1= new Cricketer();
		c1.setJerseryNo(33);
		c1.setName("Hardik");
		c1.setRole("Batting_Allrounder");
		
		/*
		Configuration config=new Configuration();
		config.addAnnotatedClass(hibernate.Cricketer.class);
		config.configure();
		
		SessionFactory factory=config.buildSessionFactory();
		
		*			or below
		*/
		
		SessionFactory factory=new Configuration()
				.addAnnotatedClass(hibernate.Cricketer.class)
				.configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction trasaction=session.beginTransaction();
		
		session.persist(c1);
		trasaction.commit();
		
		session.close();
		factory.close();
		
	}

}
