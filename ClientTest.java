import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientTest {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory f=config.buildSessionFactory();
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		StudentInfo info=new StudentInfo();
		info.setName("ganesh");
		info.setCourse("GATE");
		info.setDept("ECE");
		s.persist(info);
		tx.commit();
		s.close();
		System.out.println("DONE");
	}

}
