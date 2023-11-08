package crud.hiber;

import crud.hiber.model.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

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
//            List<Person> person = session.createQuery("FROM Person").getResultList();
//            List<Person> person = session.createQuery("FROM Person where age>30").getResultList();
//            List<Person> person = session.createQuery("FROM Person where name like 'K%'").getResultList();
//            List<Person> person = session.createQuery("FROM Person where name like '%t'").getResultList();
//            session.createQuery("update Person set name='New' where age>30").executeUpdate();
//            session.createQuery("update Person set name='FM' where name like '%w'").executeUpdate();
            session.createQuery("delete Person where age>30").executeUpdate();

           /* for (Person per :
                    person) {
                System.out.println(per);
            }*/

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