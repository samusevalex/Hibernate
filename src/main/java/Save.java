import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Save {
    public static void main(String [] args){
            SessionFactory sessionFactory = new Configuration()
                    .configure()
                    .buildSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction transaction = session.beginTransaction();
            Message message = new Message();
            message.setText("Hello World");
            session.persist(message);
            transaction.commit();
            session.close();
            sessionFactory.close();
    }
}
