package delete;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class TestClient {
	public static void main(String args[]) {
		// Activate Hibernate Software
		Configuration cfg = new Configuration();
		// make hibernate software locating and reading cfg file
		cfg = cfg.configure("/hibernate.cfg.xml");
		// create SessionFactory obj
		SessionFactory factory = cfg.buildSessionFactory();
		// create HB session obj
		Session ses = factory.openSession();
		// write o-r mapping persistence logic
		// create object for HB POJO class with data
		Employee eb = new Employee();
		eb.setEid(2);
		/*
		 * eb.setFname("Mivsh"); eb.setLname("rao"); eb.setEmail("123422");
		 */
		Transaction tx = ses.beginTransaction();
		ses.delete(eb);
		tx.commit();
		// close Stream objects
		ses.close();
		factory.close();

	}
}
