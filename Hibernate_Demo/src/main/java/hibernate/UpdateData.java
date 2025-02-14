package hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {
		Cricketer c1= new Cricketer();
		c1.setJerseryNo(33);
		c1.setName("Hardik");
		c1.setRole("Batting-Allrounder");
		
				
		SessionFactory factory=new Configuration()
				.addAnnotatedClass(hibernate.Cricketer.class)
				.configure()
				.buildSessionFactory();
		Session session = factory.openSession();
		
		Transaction trasaction=session.beginTransaction();
		
		session.merge(c1);
		trasaction.commit();
		
		session.close();
		factory.close();
		
	}

}
