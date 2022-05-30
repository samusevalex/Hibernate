import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Load {
    public static void main(String [] args){
        SessionFactory sessionFactory = new Configuration()
                .configure()
                .buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Message message = session.load(Message.class, 1L);
        System.out.println(message.getText());
        transaction.rollback();
        session.close();
        sessionFactory.close();
    }
}
