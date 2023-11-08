package crud.hiber;

import crud.hiber.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();
            Person person = session.get(Person.class, 2);
            session.delete(person);

            session.getTransaction().commit();
        } finally {
            sessionFactory.close();
        }

    }
}
    /*Person person = new Person("Kurman Aliev", 12);
    Person person2 = new Person("Zolotoy Adam", 15);
    Person person3 = new Person("Glava respublici", 33);

            session.save(person);
                    session.save(person2);
                    session.save(person3);*/