package fr;

import fr.test.entity.Auto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App {
    public static void main(String[] args) {
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        try {


            SessionFactory factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();

            Session session = factory.openSession();
            Transaction transaction = session.beginTransaction();
            Auto auto = new Auto();
            auto.setName("Ori");
            auto.setLastName("Levi");
            auto.setEmail("rt@afpa.fr");
            auto.setMember(true);
            session.save(auto);
            transaction.commit();
            session.close();
            factory.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            ex.printStackTrace();
            StandardServiceRegistryBuilder.destroy(registry);
        }

    }
}




//        try{
//            EntityManagerFactory factory = Persistence.createEntityManagerFactory("test-ejb");
//            EntityManager entityManager = factory.createEntityManager();
//            entityManager.getTransaction().begin();
//            Auto auto = new Auto();
//
//            auto.setName("Ori");
//            auto.setLastName("Levi");
//            auto.setEmail("rt@afpa.fr");
//            auto.setMember(true);
//
//
//             entityManager.persist(auto);
//            entityManager.getTransaction().commit();
//            entityManager.close();
//            factory.close();
//        }catch(Exception e){
//            System.out.println(e);
//            System.out.println(e.getStackTrace());
//        }

